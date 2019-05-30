package com.uniquindio.sanrafael.services.interfaces;
import java.util.List;
import java.util.Optional;

import com.uniquindio.sanrafael.entitys.Usuario;
import com.uniquindio.sanrafael.enums.RolesEnum;

public interface UsuarioServiceInterface {
	
	List<Usuario> findAll();
	
	Usuario save(Usuario usuario, RolesEnum tipo);
	
	Optional<Usuario> findByusernameAndPassword(String username, String password);
	List<Usuario> findByRolTipo(RolesEnum tipo );

    void deleteById(Long id);
	
}
