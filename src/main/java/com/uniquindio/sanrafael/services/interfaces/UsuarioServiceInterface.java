package com.uniquindio.sanrafael.services.interfaces;
import java.util.List;

import com.uniquindio.sanrafael.entitys.Usuario;

public interface UsuarioServiceInterface {
	List<Usuario> findAll();
	Usuario save(Usuario usuario);
	

}
