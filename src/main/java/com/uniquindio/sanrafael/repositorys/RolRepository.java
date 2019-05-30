package com.uniquindio.sanrafael.repositorys;

import org.springframework.data.repository.CrudRepository;

import com.uniquindio.sanrafael.entitys.Rol;
import com.uniquindio.sanrafael.enums.RolesEnum;

public interface RolRepository extends CrudRepository<Rol, Long>{
	
	Rol findByTipo(RolesEnum tipo);

}
