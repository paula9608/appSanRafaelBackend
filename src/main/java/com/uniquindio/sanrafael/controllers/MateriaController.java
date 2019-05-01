/**
 * 
 */
package com.uniquindio.sanrafael.controllers;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@PostMapping(value = "/materia/save")
	public ResponseEntity<Materia> save(@RequestBody Materia materia) {
		Materia materiaSave = materiaService.save(materia);
		return ResponseEntity.ok(materiaSave);
	}
}
