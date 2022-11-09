package com.flw_import.api.controller;
import com.flw_import.api.dto.as400.FlwPlanDTO;
import com.flw_import.api.model.as400.*;
import com.flw_import.api.service.as400.*;

import java.util.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;





@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/flwplan")
public class FlwPlanController {
    

    @Autowired
	private FlwPlanService flwplanService;
	
	
	
	@GetMapping(value="/getAll", produces="application/json")
	@Operation(summary = "Lista todos os planos")	    
	@ApiResponses(value = {	    
	    @ApiResponse(responseCode="404", description="Nenhum plano cadastrado!")
	})   	    
    public ResponseEntity<List<FlwPlan>> listAll(){
        			
        List<FlwPlan> planos = flwplanService.findAll();				
	    /*if (planos.isEmpty()) {
	    	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }*/
        return ResponseEntity.status(HttpStatus.OK).body(planos); 		        
    }



	@GetMapping(value="/getAllDTO", produces="application/json")
	@Operation(summary = "Lista todos os planos (DTO)")	
    @ApiResponses(value = {	    
	    @ApiResponse(responseCode="404", description="Nenhum plano cadastrado!")
	})   	    
    public ResponseEntity<List<FlwPlanDTO>> listAllDTO(){
        			
        List<FlwPlanDTO> planos = flwplanService.findAllDTO();
	    /*if (planos.isEmpty()) {
	    	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }*/
        return ResponseEntity.status(HttpStatus.OK).body(planos); 		        
        
    }	



	@GetMapping(value="/getAll2", produces="application/json")
	@Operation(summary = "Lista todos os planos (Custom)")	
    @ApiResponses(value = {	    
	    @ApiResponse(responseCode="404", description="Nenhum plano cadastrado!")
	})   	    
	//public List<FlwPlan> list(){
    public ResponseEntity<List<Object[]>> listAll2(){
        			
        List<Object[]> planos = flwplanService.findAll2();				
	    /*if (planos.isEmpty()) {
	    	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }*/
        return ResponseEntity.status(HttpStatus.OK).body(planos); 		        
        
    }	



}


