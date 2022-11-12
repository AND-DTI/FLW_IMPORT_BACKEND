package com.flw_import.api.service.as400;
import com.flw_import.api.dto.as400.FlwPlanDTO;
import com.flw_import.api.model.as400.FlwPlan;
import com.flw_import.api.repository.as400.FlwPlanRepository;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;


@Service
public class FlwPlanService {
    
    final FlwPlanRepository flwplanRepository;
	
	/*@BeforeEach
	public void setup() {
    	this.mapper = new ModelMapper();
	}*/

	//private static ModelMapper modelMapper = new ModelMapper();
	@Autowired	
	private ModelMapper modelMapper;
	


	public FlwPlanService(FlwPlanRepository flwplanRepository) {
		this.flwplanRepository = flwplanRepository;
	}

    public List<FlwPlan> findAll() {		
		
		return flwplanRepository.findAll(Sort.by(Sort.Direction.ASC, "plnseq"));
		        
	}


	public List<Object[]> findAll2() {		
		
		return flwplanRepository.findAll2();
		        
	}


	public List<FlwPlanDTO> findAllDTO() {		
		
		List<FlwPlan> planos = flwplanRepository.findAll(Sort.by(Sort.Direction.ASC, "plnseq"));
		
		//Single object
		//final var planosDTO = modelMapper.map(planos, FlwPlanDTO.class);


		//List<PostDTO> postDtoList = Arrays.asList(modelMapper.map(postEntityList, PostDTO[].class));
		List<FlwPlanDTO> planosDTO = Arrays.asList(modelMapper.map(planos, FlwPlanDTO[].class));
		
		//assertEquals(game.getId(), gameDTO.getId());
        //assertEquals(game.getName(), gameDTO.getName());


		 return planosDTO;       
	}	




}


