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
import com.uniquindio.sanrafael.entitys.Respuesta;
import com.uniquindio.sanrafael.services.interfaces.RespuestaServiceInterface;

@RestController
public class RespuestaController {
	@Autowired
	RespuestaServiceInterface respuestaService;

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/respuestas")
	public ResponseEntity<List<Respuesta>> save(@RequestBody List<Respuesta> respuesta) {
		System.out.println(respuesta.toString());
		List<Respuesta> respuestaSave = respuestaService.save(respuesta);
		return ResponseEntity.ok(respuestaSave);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/respuestas/pregunta/{id}")
	public ResponseEntity<List<Respuesta>> findByPregunta(@PathVariable(name = "id") Long idPregunta) {
		List<Respuesta> respuestas = respuestaService.findByPreguntaId(idPregunta);
		return ResponseEntity.ok(respuestas);
	}
}
