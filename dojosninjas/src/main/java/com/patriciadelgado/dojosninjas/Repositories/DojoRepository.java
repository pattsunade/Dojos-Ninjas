package com.patriciadelgado.dojosninjas.Repositories;

import java.util.List;

import com.patriciadelgado.dojosninjas.Models.Dojo;

import org.springframework.data.repository.CrudRepository;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
    List<Dojo> findAll();
    
}
