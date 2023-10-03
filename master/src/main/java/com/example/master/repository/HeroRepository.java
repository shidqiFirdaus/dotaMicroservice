package com.example.master.repository;

import com.example.master.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * HeroRepository
 */
@Repository
public interface HeroRepository extends JpaRepository<Hero, Integer> {

}
