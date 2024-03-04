package com.preparcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.preparcial.model.Persona;
import com.preparcial.repository.IPersonaRepository;

@Controller
@RequestMapping("/persona")
public class personaController {
	
	@Autowired
	private  IPersonaRepository personarepository;
	
	@GetMapping("/registro")
	private String formularioRegis (Persona persona) {
	return "formulario";
	}
	
	@PostMapping("/registro")
	private String registroPersona (Persona persona) {
		System.out.print("Inicio de registro");
		personarepository.save(persona);
		
	return "formulario";

}
}
