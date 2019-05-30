package com.uniquindio.sanrafael.repositorys;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.uniquindio.sanrafael.entitys.Pregunta;
import com.uniquindio.sanrafael.entitys.Taller;



public interface PreguntaRepository extends CrudRepository<Pregunta, Long>{
	List<Pregunta> findByTallerId(Long id);
}
