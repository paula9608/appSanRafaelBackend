package com.uniquindio.sanrafael.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniquindio.sanrafael.entitys.Usuario;
import com.uniquindio.sanrafael.repositorys.UsuarioRepository;
import com.uniquindio.sanrafael.services.interfaces.UsuarioServiceInterface;
@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioServiceInterface{
	@Autowired
	UsuarioRepository usuarioRepository;
	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}
