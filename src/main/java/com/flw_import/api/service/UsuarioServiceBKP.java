package com.flw_import.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.flw_import.api.model.Usuario;
import com.flw_import.api.repository.UsuarioRepository;
import com.flw_import.api.repository.UsuarioRepository_BKP;





/*@Service
public class UsuarioService implements UsuarioRepository{

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return findAll();		
	}

	@Override
	public List<Usuario> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Usuario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> findById(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}*/










/*public interface UsuarioService {
	//public Usuario saveUsuario(Usuario student);
    public List<Usuario> getAllUsuario();
}*/

@Service
public class UsuarioServiceBKP {
	
	final UsuarioRepository_BKP usuarioRepository;
	
	public UsuarioServiceBKP(UsuarioRepository_BKP usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public List<Usuario> findAll() {
		//return usuarioRepository.findAll();
		
		//return usuarioRepository.findDistinctUsers();
		return usuarioRepository.findDistinctBy(null);
	}
		
	
	/*public Optional<Usuario> findById(String id) {		
		return usuarioRepository.findById(id);		
	}*/
	
	public List<Usuario> listByUsername(String username) {
		
		
		//return usuarioRepository.findUsuariosByUsername(username);
		return null;
		
		
		//return usuarioRepository.findByUsername(id);		
		//return usuarioRepository.findByUsernameOrderByUsername(username);
		
		
		//Optional<List<Usuario>> usuarios = usuarioRepository.findByUsername(id);
		//return usuarios.get();
		
		
	}
	
		
		

	
	
}