package com.flw_import.api.service.comex;
import com.flw_import.api.model.comex.Usuario;
//import com.flw_import.api.repository.comex.UsuarioRepository;
import com.flw_import.api.repository.comex.UsuarioRepository_BKP;

import java.util.List;
//import java.util.Optional;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;





/*@Service
public class UsuarioService implements UsuarioRepository{

	@Override
	public List<Usuario> findAll() {		
		return findAll();		
	}

	@Override
	public List<Usuario> findAll(Sort sort) {		
		return null;
	}

	@Override
	public Page<Usuario> findAll(Pageable pageable) {		
		return null;
	}

	@Override
	public Optional<Usuario> findById(String id) {		
		return Optional.empty();
	}

	@Override
	public long count() {
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