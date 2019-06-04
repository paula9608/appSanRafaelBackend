package com.uniquindio.sanrafael.repositorys;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.uniquindio.sanrafael.entitys.Pregunta;

public interface PreguntaRepository extends CrudRepository<Pregunta, Long>{
	List<Pregunta> findByTallerId(Long id);
	void deleteById(Long id);
}
