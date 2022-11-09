package com.flw_import.api.repository.comex;



import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flw_import.api.model.comex.Usuario;

//@Repository
public interface UsuarioRepository_BKP extends JpaRepository<Usuario,String> {
//public interface UsuarioRepository extends ReadOnlyRepository<Usuario,String> {
	
	
	
   /*@Query(value = 		
	"select distinct sg.username as id, sg.username, "+ 
	"	    (select u.nome from sfwhmm.sfw_usuario u where u.username=sg.username) nome,    sg.grupo "+
	"	from sfwhmm.sfw_sistema_grupo sg	"+									
	"where  cod_sistema = 21 and " +
	"	   substr(sg.username,1,2) = 'SB' "+
	"	   and username = 'SB037635' " 						
	, nativeQuery = true) */
	List<Usuario> findAll(); 
	
	
	//List<Usuario> findDistinctProcessorsByprocessorName();
	@Query(value =
	"select * from sfwcsthmm.vw_user_role_cst where username='SB037635' "
	, nativeQuery = true)
	List<Usuario> findDistinctUsers();
	
	
	List<Usuario> findDistinctBy(Sort sort);
	
	
	/*@Query(value = 
	"select id, username, nome, grupo from vw_user_role_cst " +
	"where username= :usr "
	, nativeQuery = true)
	List<Usuario> findUsuariosByUsername(@Param("usr") String username);-*/
	
	//List<Usuario> findByUsername(@Param("username") String username);
	
}




