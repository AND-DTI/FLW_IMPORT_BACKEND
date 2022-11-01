package com.flw_import.api.model;

//import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "vw_user_role_cst")
//@Table(name = "sfw_sistema_grupo")
public class Usuario /*implements Serializable*/{

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id2", unique=false)
	private String id;	
	
	@Column(name="username")	
	private String username;
	
	@Column(name="nome", columnDefinition="varchar2")
	private String nome;
	
	//@Column(name="grupo", unique=false)
	//private String grupo;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="username")
	private List<Roles> roles;
	
	
	public String getId() { return id;	}
	
	public String getUsername() { return username; }
	
	public String getNome() { return nome; 	}
	
	public List<Roles> getRoles() { return roles; }	
	//public String getGrupo() { return grupo; }

	
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
		
	}



}
