package com.example.master.service;

import com.example.master.model.Hero;
import com.example.master.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroService {


    @Autowired
    private HeroRepository heroRepository;

    public ResponseEntity<?> getAllHeroes(){
        List<Hero> heroes = heroRepository.findAll();
        if(heroes.isEmpty()) return ResponseEntity.noContent().build();

        return ResponseEntity.ok(heroes);
    }

    public ResponseEntity<?> getHeroById(Integer id){
         Hero hero = heroRepository.findById(id).orElseThrow();
         return ResponseEntity.ok(hero);
    }
}
