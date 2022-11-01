package com.flw_import.api.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.flw_import.api.model.Usuario;
import com.flw_import.api.repository.UsuarioRepository;





@Service
public class UsuarioService {
	
	final UsuarioRepository usuarioRepository;
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	
	public List<Usuario> findAll() {
		
		return usuarioRepository.findAll();
		
	}
		
	
	
	public List<Usuario> listByUsername(String username) {
				
		return usuarioRepository.findDistinctByUsername(username.toUpperCase());
							
	}
	
		
		

	
	
}