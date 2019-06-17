package com.uniquindio.sanrafael.controllers;
import java.util.List;

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

import com.uniquindio.sanrafael.entitys.Pregunta;
import com.uniquindio.sanrafael.entitys.Taller;
import com.uniquindio.sanrafael.services.interfaces.PreguntaServiceInterface;

@RestController
public class PreguntaController {
	@Autowired
	PreguntaServiceInterface preguntaService;
	
	@CrossOrigin(origins = "https://app-san-rafael.herokuapp.com")
	@PostMapping(value = "/preguntas")
	public ResponseEntity<Pregunta> save(@RequestBody Pregunta pregunta) {
		Pregunta preguntaSave = preguntaService.save(pregunta);
		return ResponseEntity.ok(preguntaSave);
	}
	 
	@CrossOrigin(origins = "https://app-san-rafael.herokuapp.com")
	@GetMapping(value = "/preguntas/taller/{id}")
	public ResponseEntity<List<Pregunta>> findByTaller(@PathVariable(name = "id") Long idTaller) {
		List<Pregunta> preguntas = preguntaService.findByTallerId(idTaller);
		return ResponseEntity.ok(preguntas);
	}
	
	  @CrossOrigin(origins = "https://app-san-rafael.herokuapp.com")
	@DeleteMapping(value = "/preguntas/{id}")
	public ResponseEntity<List<Pregunta>> deleteById(@PathVariable Long id,@RequestParam Long idTaller){
		preguntaService.deleteById(id);
		 return ResponseEntity.ok(preguntaService.findByTallerId(idTaller)); 
	}
	  
	  
	   
	 
}
