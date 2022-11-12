package com.flw_import.api.repository.comex;
import com.flw_import.api.model.comex.Roles;

//import java.util.List;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;





public interface RolesRepository extends JpaRepository<Roles,String>{
	
	//Sort sort = new Sort(Direction.ASC, "username");
	//List<Roles> findByUsername();
	
}