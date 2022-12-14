package com.flw_import.api.service.comex;

import java.util.List;

import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.flw_import.api.model.comex.Roles;
import com.flw_import.api.repository.comex.RolesRepository;


@Service
public class RolesService {

		

	final RolesRepository rolesRepository;
	
	public RolesService(RolesRepository rolesRepository) {
		this.rolesRepository = rolesRepository;
	}
	
	public List<Roles> findAll() {
		
		//Sort sort = new Sort(Direction.ASC, "username");
		//return rolesRepository.findAll();		
		return rolesRepository.findAll(Sort.by(Sort.Direction.ASC, "username"));
				
	}	

}
