package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String enviarForm(Usuario usuario) {
		return "login";
	}
	
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		
		//Credenciales quemadas
		//usuario: Elsy
		//contrasena: 12345
		
		if(usuario.getUsername().equals("Elsy") && usuario.getContrasena().equals("12345")) {
			
			return "mostrarMensajeV";
			
		} else {
			
			return "mostrarMensajeF";
			
		}
		
	}
}