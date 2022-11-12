package com.flw_import.api.configs.history;

/*import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
*/
//import com.algaworks.multidb.repository.app.LivroRepository;

/*
@Configuration
@EnableJpaRepositories(
		//basePackageClasses = LivroRepository.class,
		basePackages = { "com.flw_import.api.repository" },
		entityManagerFactoryRef = "comexEntityManager")
public class ComexDbConfig {
	
	@Bean
	@Primary
	@ConfigurationProperties(prefix = "comex.datasource")
	public DataSource comexDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	@Primary
	public LocalContainerEntityManagerFactoryBean comexEntityManager(
			EntityManagerFactoryBuilder builder,
			@Qualifier("comexDataSource") DataSource dataSource) {
		return builder
				.dataSource(dataSource)
				.packages("com.flw_import.api.model.comex")
				.build();
	}
	
}
*/
