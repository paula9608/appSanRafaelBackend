package com.uniquindio.sanrafael.repositorys;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.uniquindio.sanrafael.entitys.Usuario;
import com.uniquindio.sanrafael.enums.RolesEnum;


public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
 
	Optional<Usuario> findByUsernameAndPassword(String username, String password);
	List<Usuario> findByRolTipo(RolesEnum tipo);
	
}
