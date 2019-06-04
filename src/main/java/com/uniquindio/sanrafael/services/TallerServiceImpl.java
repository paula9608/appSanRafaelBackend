package com.uniquindio.sanrafael.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniquindio.sanrafael.entitys.Taller;
import com.uniquindio.sanrafael.enums.GradoEnum;
import com.uniquindio.sanrafael.repositorys.TallerRepository;
import com.uniquindio.sanrafael.services.interfaces.TallerServiceInterface;

@Service
@Transactional
public class TallerServiceImpl implements TallerServiceInterface {
	
	@Autowired
	TallerRepository tallerRepository;
	
	@Override
	public Taller save(Taller taller) {	
		return tallerRepository.save(taller);
	}

	@Override
	public List<Taller> findByMateriaId(Long materiaId) {
		List<Taller> talleres = tallerRepository.findByMateriaId(materiaId);
		return talleres;
	}

	@Override
	public void deleteById(Long id) {
		tallerRepository.deleteById(id);
	}

	@Override
	public Taller findById(Long id) {
		return tallerRepository.findById(id).get();
	}

	@Override
	public List<Taller> findByGrado(GradoEnum grado) {
		List<Taller> talleres = tallerRepository.findByGrado(grado);
		return talleres;
	}

}
