package com.uniquindio.sanrafael.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniquindio.sanrafael.entitys.Pregunta;
import com.uniquindio.sanrafael.repositorys.PreguntaRepository;
import com.uniquindio.sanrafael.services.interfaces.PreguntaServiceInterface;

@Service
@Transactional
public class PreguntaServiceImpl implements PreguntaServiceInterface{

	@Autowired
	PreguntaRepository preguntaRepository;
	
	@Override
	public Pregunta save(Pregunta pregunta) {
		return preguntaRepository.save(pregunta);
	}

	@Override
	public List<Pregunta> findByTallerId(Long tallerId) {
		List<Pregunta> preguntaSave= preguntaRepository.findByTallerId(tallerId);
		return preguntaSave;
	}

	@Override
	public void deleteById(Long id) {
	
	
		preguntaRepository.deleteById(id);
	
	}

}
