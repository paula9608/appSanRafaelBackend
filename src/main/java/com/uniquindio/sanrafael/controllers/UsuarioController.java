package com.uniquindio.sanrafael.controllers;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uniquindio.sanrafael.entitys.Usuario;
import com.uniquindio.sanrafael.enums.RolesEnum;
import com.uniquindio.sanrafael.services.interfaces.UsuarioServiceInterface;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioServiceInterface usuarioService;
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/usuarios")
	public ResponseEntity<Usuario> save(@RequestBody Usuario usuario, @RequestParam(name = "rol") RolesEnum tipo) {
		Usuario usuarioSave = usuarioService.save(usuario, tipo);
		return ResponseEntity.ok(usuarioSave);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping(value = "/usuarios/{id}")
	public ResponseEntity<List<Usuario>> deleteById(@PathVariable long id,@RequestParam String tipo){
		 usuarioService.deleteById(id);
		 return ResponseEntity.ok(usuarioService.findByRolTipo(RolesEnum.valueOf(tipo))); 
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/usuarios/login")
	public ResponseEntity<Usuario> login(@RequestParam String username,  @RequestParam String password) {
		
		Optional<Usuario> usuario = usuarioService.findByusernameAndPassword(username, password);
		return usuario.isPresent() ? ResponseEntity.ok(usuario.get()) : ResponseEntity.notFound().build();
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/usuarios")
	public ResponseEntity<List<Usuario>> findByRolTipo(@RequestParam String tipo) {
		
		List<Usuario> usuarios = usuarioService.findByRolTipo(RolesEnum.valueOf(tipo)); 
		return ResponseEntity.ok(usuarios);
	}
	
	
}
