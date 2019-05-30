package com.uniquindio.sanrafael.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniquindio.sanrafael.entitys.Materia;
import com.uniquindio.sanrafael.repositorys.MateriaRepository;
import com.uniquindio.sanrafael.services.interfaces.MateriaServiceInterface;

@Service
@Transactional
public class MateriaServiceImpl implements MateriaServiceInterface {

	@Autowired
	MateriaRepository materiaRepository;
	
	@Override
	public List<Materia> findAll() {
		List<Materia> materias = StreamSupport
				.stream(materiaRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return materias;
	}

	@Override
	public Materia save(Materia materia) {
		return materiaRepository.save(materia);
	}

	@Override
	public Materia findMateria(Long id) {
		
		return materiaRepository.findById(id).get();
	}

}
