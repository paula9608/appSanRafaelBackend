package com.uniquindio.sanrafael.repositorys;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.uniquindio.sanrafael.entitys.Respuesta;
import com.uniquindio.sanrafael.entitys.Taller;



public interface RespuestaRepository extends CrudRepository<Respuesta, Long>{

	List<Respuesta> findByPreguntaId(Long idPregunta);

}
