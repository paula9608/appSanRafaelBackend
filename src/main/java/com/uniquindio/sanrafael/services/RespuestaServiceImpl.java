package com.uniquindio.sanrafael.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniquindio.sanrafael.entitys.Respuesta;
import com.uniquindio.sanrafael.repositorys.RespuestaRepository;
import com.uniquindio.sanrafael.services.interfaces.RespuestaServiceInterface;

@Service
@Transactional
public class RespuestaServiceImpl implements RespuestaServiceInterface{
	@Autowired
	RespuestaRepository respuestaRepository;
	
	@Override
	public List<Respuesta> save(List<Respuesta> respuestas) {
		return StreamSupport.stream(respuestaRepository.saveAll(respuestas).spliterator(), false).collect(Collectors.toList());
	}

	@Override
	public List<Respuesta> findByPreguntaId(Long idPregunta) {
	 List<Respuesta> respuestas = respuestaRepository.findByPreguntaId(idPregunta);
		
		return respuestas;
	}

}
