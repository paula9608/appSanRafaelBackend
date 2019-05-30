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

import com.uniquindio.sanrafael.entitys.Pregunta;
import com.uniquindio.sanrafael.entitys.Taller;
import com.uniquindio.sanrafael.services.interfaces.PreguntaServiceInterface;

@RestController
public class PreguntaController {
	@Autowired
	PreguntaServiceInterface preguntaService;
	
	 @CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/preguntas")
	public ResponseEntity<Pregunta> save(@RequestBody Pregunta pregunta) {
		Pregunta preguntaSave = preguntaService.save(pregunta);
		return ResponseEntity.ok(preguntaSave);
	}
	  @CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/preguntas/taller/{id}")
	public ResponseEntity<List<Pregunta>> findByTaller(@PathVariable(name = "id") Long idTaller) {
		List<Pregunta> preguntas = preguntaService.findByTallerId(idTaller);
		return ResponseEntity.ok(preguntas);
	}
	  
	 
}
