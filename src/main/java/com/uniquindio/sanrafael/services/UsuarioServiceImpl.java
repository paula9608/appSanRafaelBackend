package com.uniquindio.sanrafael.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniquindio.sanrafael.entitys.Materia;
import com.uniquindio.sanrafael.entitys.Rol;
import com.uniquindio.sanrafael.entitys.Usuario;
import com.uniquindio.sanrafael.enums.GradoEnum;
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
		List<Usuario> usuarios = StreamSupport
				.stream(usuarioRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return usuarios;
	}

	@Override
	public Usuario save(Usuario usuario, RolesEnum tipo) {
		Rol rol = rolRepository.findByTipo(tipo);
		usuario.setRol(rol);
		if(usuario.getPassword()==null && usuario.getUsername()==null) {
			String pass=GradoEnum.valueOf(usuario.getGrado()).getValor()+""+usuario.getApellido();
			usuario.setPassword(pass);
			usuario.setUsername(usuario.getNombre());
			return usuarioRepository.save(usuario);
		}
		return usuarioRepository.save(usuario);
	}

	@Override
	public Optional<Usuario> findByusernameAndPassword(String username, String password) {
		return  usuarioRepository.findByUsernameAndPassword(username, password);
	}

	@Override
	public List<Usuario>findByRolTipo(RolesEnum tipo) {
		List<Usuario> usuarios = StreamSupport
				.stream(usuarioRepository.findByRolTipo(tipo).spliterator(), false)
				.collect(Collectors.toList());
		return usuarios;
	}

	@Override
	 public void deleteById(Long id){
		usuarioRepository.deleteById(id);
		
	}

	

	

}
