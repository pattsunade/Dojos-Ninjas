package com.patriciadelgado.dojosninjas.Repositories;

import java.util.List;

import com.patriciadelgado.dojosninjas.Models.Ninja;

import org.springframework.data.repository.CrudRepository;

public interface NinjaRepository extends CrudRepository<Ninja, Long>  {
      List<Ninja> findAll();
}
