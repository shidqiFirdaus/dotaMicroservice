package com.example.master.model;

import org.springframework.boot.autoconfigure.graphql.GraphQlProperties.Schema.Printer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Hero
 */
@Entity
@Table(name = "Heroes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hero {

  @Id
  private Integer id;
  @Column(name = "Hero")
  private String hero;
  @Column(name = "Strength")
  private String strength;
  @Column(name = "Agility")
  private String agility;
  @Column(name = "Intelligence")
  private String intelligence;
}
