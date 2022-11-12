package com.flw_import.api.model.comex;

//import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "vw_user_cst")
public class Usuario /*implements Serializable*/{

	//private static final long serialVersionUID = 1L;
	
	@Id
	//@Column(name="id2", unique=false)
	//private String id;		
	@Column(name="username")	
	private String username;
	
	@Column(name="nome", columnDefinition="varchar2")
	private String nome;
	
	@Column(name="email", unique=false)
	private String email;
	
	@Column(name="ativo", columnDefinition="char(1)")
	private String ativo;
	
	private String departamento;	
	
	@OneToMany(cascade = CascadeType.ALL) //mappedBy = "username" --> replaces join	
	@JoinColumn(name="username")
	private List<Roles> roles;
	
	public Usuario() {
		
	}
			
	public String getUsername() 	{ return username; }
	
	public String getNome() 		{ return nome; 	}
	
	public String getEmail() 		{ return email; 	}
	
	public String getAtivo() 		{ return ativo; 	}
	
	public String getDepartamento() { return departamento; 	}
	
	public List<Roles> getRoles() 	{ return roles; }	
		

}
