package com.example.projeto.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto.entities.Usuario;

@RestController
@RequestMapping("/users")
public class UsuaResources {

	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(1L, "Caio", "caio@gmail.com", "12345-8956", "2534");
		return ResponseEntity.ok().body(u);
	}
	
}
