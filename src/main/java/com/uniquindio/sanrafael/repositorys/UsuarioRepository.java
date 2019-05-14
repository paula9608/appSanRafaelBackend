package com.uniquindio.sanrafael.repositorys;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.uniquindio.sanrafael.entitys.Usuario;


public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	Optional<Usuario> findByUsernameAndPassword(String username, String password);
}
