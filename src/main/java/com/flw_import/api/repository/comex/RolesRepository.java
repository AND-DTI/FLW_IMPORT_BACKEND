package com.flw_import.api.repository.comex;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

import com.flw_import.api.model.comex.Roles;





public interface RolesRepository extends JpaRepository<Roles,String>{
	
	//Sort sort = new Sort(Direction.ASC, "username");
	//List<Roles> findByUsername();
	
}