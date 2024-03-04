package com.preparcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preparcial.model.Persona;

public interface IPersonaRepository extends JpaRepository<Persona , Long> {
	
	

}
