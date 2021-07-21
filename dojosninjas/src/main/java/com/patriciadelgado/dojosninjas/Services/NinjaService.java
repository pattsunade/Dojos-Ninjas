package com.patriciadelgado.dojosninjas.Services;

import java.util.List;
import java.util.Optional;

import com.patriciadelgado.dojosninjas.Models.Ninja;
import com.patriciadelgado.dojosninjas.Repositories.NinjaRepository;

import org.springframework.stereotype.Service;

@Service
public class NinjaService {
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<Ninja> allNinja() {
        return ninjaRepository.findAll();
    }

    public Ninja createNinja(Ninja n) {
        return ninjaRepository.save(n);
    }

    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if (optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
}
