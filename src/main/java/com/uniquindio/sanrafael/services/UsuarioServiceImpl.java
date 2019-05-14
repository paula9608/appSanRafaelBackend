package com.uniquindio.sanrafael.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniquindio.sanrafael.entitys.Rol;
import com.uniquindio.sanrafael.entitys.Usuario;
import com.uniquindio.sanrafael.enums.RolesEnum;
import com.uniquindio.sanrafael.repositorys.RolRepository;
import com.uniquindio.sanrafael.repositorys.UsuarioRepository;
import com.uniquindio.sanrafael.services.interfaces.UsuarioServiceInterface;
@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioServiceInterface{
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	RolRepository rolRepository;
	
	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario save(Usuario usuario, RolesEnum tipo) {
		Rol rol = rolRepository.findByTipo(tipo);
		usuario.setRol(rol);
		return usuarioRepository.save(usuario);
	}

	@Override
	public Optional<Usuario> findByusernameAndPassword(String username, String password) {
		return  usuarioRepository.findByUsernameAndPassword(username, password);
	}

}
