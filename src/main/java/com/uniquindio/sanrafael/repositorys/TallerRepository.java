package com.uniquindio.sanrafael.repositorys;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.uniquindio.sanrafael.entitys.Taller;
import com.uniquindio.sanrafael.enums.GradoEnum;



public interface TallerRepository extends CrudRepository<Taller, Long> {
	
	List<Taller> findByMateriaId(Long id);
	
	void deleteById(Long id);
	
	List<Taller> findByGrado(GradoEnum grado);
}
