package com.uniquindio.sanrafael.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uniquindio.sanrafael.entitys.Usuario;
import com.uniquindio.sanrafael.services.interfaces.UsuarioServiceInterface;

@RestController
public class UsuarioController {
	@Autowired
	private UsuarioServiceInterface usuarioService;

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/usuarios")
	public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {
		Usuario usuarioSave = usuarioService.save(usuario);
		return ResponseEntity.ok(usuarioSave);
	}

}
