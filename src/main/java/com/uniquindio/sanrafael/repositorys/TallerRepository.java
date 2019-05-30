package com.uniquindio.sanrafael.repositorys;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.uniquindio.sanrafael.entitys.Taller;



public interface TallerRepository extends CrudRepository<Taller, Long> {
	
	List<Taller> findByMateriaId(Long id);
	void deleteById(Long id);
}
