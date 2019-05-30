package com.uniquindio.sanrafael.services.interfaces;

import java.util.List;

import com.uniquindio.sanrafael.entitys.Taller;

public interface TallerServiceInterface {
	
	Taller save(Taller taller);
	
	List<Taller> findByMateriaId(Long materiaId);

	void deleteById(Long id);
}
