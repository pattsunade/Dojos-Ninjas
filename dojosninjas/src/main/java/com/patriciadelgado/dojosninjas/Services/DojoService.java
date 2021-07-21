package com.patriciadelgado.dojosninjas.Services;

import java.util.List;
import java.util.Optional;

import com.patriciadelgado.dojosninjas.Models.Dojo;
import com.patriciadelgado.dojosninjas.Repositories.DojoRepository;

import org.springframework.stereotype.Service;

@Service
public class DojoService {
    private final DojoRepository dojoRepository;
    
     public DojoService(DojoRepository dojoRepository) {
        this.dojoRepository = dojoRepository;
    }

    public List<Dojo> allDojo() {
        return dojoRepository.findAll();
    }

    public Dojo createDojo(Dojo d) {
        return dojoRepository.save(d);
    }

    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if (optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
}
