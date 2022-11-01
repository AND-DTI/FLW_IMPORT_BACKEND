package com.flw_import.api.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.flw_import.api.model.Usuario;




@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String> {
//public interface UsuarioRepository extends ReadOnlyRepository<Usuario,String> {
	
	
	List<Usuario> findAll(); 
		
	
	List<Usuario> findDistinctByUsername(String username);
	
}




