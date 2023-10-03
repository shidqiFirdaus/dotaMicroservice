package com.example.master.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * HeroController
 */
@RestController
@RequestMapping("/heroes")
public class HeroController {

  @GetMapping
  public ResponseEntity<?> getHeroes(){
    return ResponseEntity.ok("heroes");
  }
  @GetMapping("/{id}")
  public ResponseEntity<?> getHeroById(@PathVariable Integer id ){
    return ResponseEntity.ok("Hello World");
  }

  @GetMapping("/test")
  public String test(){
    return "hello worls!";
  }



}
