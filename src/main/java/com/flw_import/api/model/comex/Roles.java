package com.flw_import.api.model.comex;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;



@Entity
@Immutable
@Table(name = "vw_roles_cst")
public class Roles {

	
			
	@Id
	@Column(name="rolename"/*, unique=false*/)
	private String roleName;
		
	private String descricao;
	
	private String username;
	
	
	public Roles() {
		
	}


	public String getRoleName() { return roleName; }
	
	public String getDescricao() { return descricao; }

	public String getUsername() { return username; }
	


}
