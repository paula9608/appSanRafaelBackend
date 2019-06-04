package com.uniquindio.sanrafael.services.interfaces;

import java.util.List;

import com.uniquindio.sanrafael.entitys.Taller;
import com.uniquindio.sanrafael.enums.GradoEnum;

public interface TallerServiceInterface {
	
	Taller save(Taller taller);
	
	List<Taller> findByMateriaId(Long materiaId);

	void deleteById(Long id);
	
	Taller findById(Long id);

	List<Taller> findByGrado(GradoEnum grado);
}
