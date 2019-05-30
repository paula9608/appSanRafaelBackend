package com.uniquindio.sanrafael.services.interfaces;

import java.util.List;

import com.uniquindio.sanrafael.entitys.Materia;

public interface MateriaServiceInterface {
	List<Materia> findAll();
	
	Materia save(Materia materia);

	Materia findMateria(Long id);
}
