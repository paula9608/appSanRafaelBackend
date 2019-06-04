/**
 * 
 */
package com.uniquindio.sanrafael.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uniquindio.sanrafael.entitys.Materia;
import com.uniquindio.sanrafael.services.interfaces.MateriaServiceInterface;

/**
 * @author user
 *
 */
@RestController
public class MateriaController {
	
	@Autowired
	private MateriaServiceInterface materiaService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/materias")
	public ResponseEntity<List<Materia>> findAll() {
		List<Materia> materias = materiaService.findAll();
		return ResponseEntity.ok(materias);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/materias")
	public ResponseEntity<Materia> save(@RequestBody Materia materia) {
		Materia materiaSave = materiaService.save(materia);
		return ResponseEntity.ok(materiaSave);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/materias/{id}")
	public ResponseEntity <Materia> findMateria(@PathVariable Long id) {
		Materia materia = materiaService.findMateria(id);
		return ResponseEntity.ok().body(materia);
	}
	
}
