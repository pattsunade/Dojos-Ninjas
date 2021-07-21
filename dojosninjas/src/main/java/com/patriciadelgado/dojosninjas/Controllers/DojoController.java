package com.patriciadelgado.dojosninjas.Controllers;


import javax.validation.Valid;

import com.patriciadelgado.dojosninjas.Models.Dojo;

import com.patriciadelgado.dojosninjas.Services.DojoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DojoController {
    private final DojoService dojoService;
    

public DojoController(DojoService dojoService) {
        this.dojoService = dojoService;
    }
@GetMapping("/dojos/new")
    public String newDojo(
            @ModelAttribute("dojo") Dojo dojo) {
        return "/newDojo.jsp";
    }
@PostMapping("/dojos/new")
public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
    if (result.hasErrors()) {
        return "/newNinja.jsp";
    } else {
        dojoService.createDojo(dojo);
        return "redirect:/ninja/new";
    }
}
    @GetMapping("/dojos/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Dojo dojo = dojoService.findDojo(id);
        if (dojo == null) {
            return "/ninja.new";
        } else {
            model.addAttribute("dojo", dojo);
            return "dojos.jsp";
    }
        
    }
}
