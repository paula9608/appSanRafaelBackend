package com.uniquindio.sanrafael.controllers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

import com.uniquindio.sanrafael.entitys.Taller;
import com.uniquindio.sanrafael.entitys.Usuario;
import com.uniquindio.sanrafael.enums.GradoEnum;
import com.uniquindio.sanrafael.services.interfaces.TallerServiceInterface;

@RestController
public class TallerController {

	@Autowired
	private TallerServiceInterface tallerService;

	@CrossOrigin(origins = "https://app-san-rafael.herokuapp.com")
	@PostMapping(value = "/talleres")
	public ResponseEntity<Taller> save(@RequestBody Taller taller) {
		Taller tallerSave = tallerService.save(taller);
		return ResponseEntity.ok(tallerSave);
	}

	@CrossOrigin(origins = "https://app-san-rafael.herokuapp.com")
	@GetMapping(value = "/talleres/materia/{id}")
	public ResponseEntity<List<Taller>> findByMateria(@PathVariable(name = "id") Long idMateria) {
		List<Taller> talleres = tallerService.findByMateriaId(idMateria);
		return ResponseEntity.ok(talleres);
	}
	

	@CrossOrigin(origins = "https://app-san-rafael.herokuapp.com")
	@GetMapping(value = "/talleres/usuario/{grado}")
	public ResponseEntity<List<Taller>> findByGrado(@PathVariable(name = "grado") GradoEnum grado) {
		List<Taller> talleres = tallerService.findByGrado(grado);
		return ResponseEntity.ok(talleres);
	}

	@CrossOrigin(origins = "https://app-san-rafael.herokuapp.com")
	@DeleteMapping(value = "/talleres/{id}")
	public ResponseEntity<List<Taller>> deleteById(@PathVariable Long id, @RequestParam Long idMateria) {
		tallerService.deleteById(id);
		return ResponseEntity.ok(tallerService.findByMateriaId(idMateria));
	}

	@CrossOrigin(origins = "https://app-san-rafael.herokuapp.com")
	@GetMapping(value = "/talleres/{id}")
	public ResponseEntity<Taller> findById(@PathVariable Long id) {
		Taller taller = tallerService.findById(id);
		return ResponseEntity.ok(taller);
	}
}
