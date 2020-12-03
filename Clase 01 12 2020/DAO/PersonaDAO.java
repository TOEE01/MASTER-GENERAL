package com.melvin.HelloSpring.DAO;

import org.springframework.data.repository.CrudRepository;

import com.melvin.HelloSpring.Entidades.Persona;

public interface PersonaDAO extends CrudRepository<Persona, Long> {

}
