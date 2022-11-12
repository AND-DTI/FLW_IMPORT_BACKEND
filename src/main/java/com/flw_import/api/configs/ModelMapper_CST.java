package com.flw_import.api.configs;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
//import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




@Configuration
public class ModelMapper_CST {
    

    @Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		
        
        /*modelMapper.getConfiguration()
			//.setMatchingStrategy(MatchingStrategies.STRICT)
			.setMatchingStrategy(MatchingStrategies.STANDARD)
			//.enableFieldMatching(true)
			.setFieldAccessLevel(AccessLevel.PUBLIC)
		;*/


        modelMapper.getConfiguration()
        .setFieldMatchingEnabled(true)
        .setFieldAccessLevel(AccessLevel.PRIVATE);        



		return modelMapper;
	}	


    

}