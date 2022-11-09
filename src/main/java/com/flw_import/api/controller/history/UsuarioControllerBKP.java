package com.flw_import.api.controller.history;

//import com.arjuncodes.studentsystem.model.Student;
//import com.arjuncodes.studentsystem.service.StudentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.flw_import.api.model.comex.Roles;
import com.flw_import.api.model.comex.Usuario;
import com.flw_import.api.service.comex.RolesService;
import com.flw_import.api.service.comex.UsuarioService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/usuario")
//@CrossOrigin
public class UsuarioControllerBKP {
    
	@Value("${varteste:123456}")
	String vartest;
	@Autowired
	private UsuarioService usuarioServiceBKP;
	@Autowired
	private RolesService rolesService;
	
	/*
	
	@GetMapping(value="/getAll", produces="application/json")
	@Operation(summary = "Lista todos os usuários!")
	public List<Usuario> list(){
		return usuarioServiceBKP.findAll();	
    }
	
	
	
	
	@GetMapping(value="/getUser/{id}", produces="application/json")
	@Operation(summary = "Pega usuário")	
	//@ResponseBody(Usuario)
	@ApiResponses(value = {
	    @ApiResponse(responseCode="200", description="OK!"),
	    @ApiResponse(responseCode="404", description="Usuário não encontrado"),
	    @ApiResponse(responseCode="500", description="Internal Server Error!"),  	    
	})   
	//public ResponseEntity<List<Usuario>> getOneUser(@PathVariable(value = "id") String id){
	public ResponseEntity<List<Usuario>> listUserRoles(@PathVariable(value = "username") String username){
		
		List<Usuario> usuarios = usuarioServiceBKP.listByUsername(username);
		
		
		
		//return ResponseEntity.status(HttpStatus.OK).body(usuarioOptional.get());    
	    ///if (!usuarioOptional.isPresent()) {
	    // 	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        //}
        return ResponseEntity.status(HttpStatus.OK).body(usuarios); 		
		
		
	}
	
	
	@GetMapping(value="/roles", produces="application/json")
	@Operation(summary = "List all roles.")	
	public List<Roles> listRoles(){        	
		return rolesService.findAll();			
    }
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public ResponseEntity<Usuario> getOneUser(@PathVariable(value = "id") String id){
		
		Optional<Usuario> usuarioOptional = usuarioService.findById(id);
		
		
		//return ResponseEntity.status(HttpStatus.OK).body(usuarioOptional.get());    
	    if (!usuarioOptional.isPresent()) {
	    	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(usuarioOptional.get()); 		
		
		
	}*/
	/*public ResponseEntity<Object> getOneUser(@PathVariable(value = "id") String id){
        
		Optional<Usuario> usuarioOptional = usuarioService.findById(id);
                
        if (!usuarioOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(usuarioOptional.get());    
    }*/
	
	
	
	/*public Usuario getUsr(String ID){
        	
		return usuarioService.findById(ID);
    }*/	
	
	
	
	
	
	
	
	//@Autowired
    //private StudentService studentService;
    
    /*

    @PostMapping(value="/add", produces="application/text")
    @Operation(summary = "Cadastra estudante!!!")
    @ApiResponses(value = {
        @ApiResponse(responseCode="201", description="{id: string}"),
    })
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    } */

    /*@PreAuthorize("hasRole('USER')")
    @GetMapping(value="/getAll", produces="application/json")
    @Operation(summary = "Lista todos os estudantes--!")*/
    /*@ApiResponses(value = {
        @ApiResponse(responseCode="200", description="OK!"),
        @ApiResponse(responseCode="500", description="Internal Server Error!"),       
    })*/    
    
}
