package com.patriciadelgado.dojosninjas.Controllers;

import java.util.List;

import javax.validation.Valid;

import com.patriciadelgado.dojosninjas.Models.Dojo;
import com.patriciadelgado.dojosninjas.Models.Ninja;
import com.patriciadelgado.dojosninjas.Services.DojoService;
import com.patriciadelgado.dojosninjas.Services.NinjaService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NinjaController {
    private final NinjaService ninjaService;
    private final DojoService dojoService;
    
public NinjaController(NinjaService ninjaService, DojoService dojoService) {
        this.ninjaService = ninjaService;
        this.dojoService = dojoService;
    }
@GetMapping("ninja/new")
public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
    List<Dojo> dojo = dojoService.allDojo();
    model.addAttribute("dojo", dojo);
    model.addAttribute("ninja", ninja);
    return "/newNinja.jsp";
}
@PostMapping("/ninja/new")
public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
    if (result.hasErrors()) {
        return "/newNinja.jsp";
    } else {
       ninjaService.createNinja(ninja);
        return "redirect:/dojos/"+ninja.getDojo().getId();
    }
}

    
}
