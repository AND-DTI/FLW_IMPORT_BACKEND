package com.flw_import.api.configs;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(
  basePackages = "com.flw_import.api.repository.comex",
  entityManagerFactoryRef = "comex_EntityManager",
  transactionManagerRef = "comex_TransactionManager")
public class PersistenceComexConfig {
    
	@Autowired 
	Environment env;	
	String ds_dialect = "spring.datasource.database-platform";
    String ds_ddlauto = "spring.datasource.hibernate.ddl-auto";
    String ds_modelPackages = "com.flw_import.api.model.comex";
    
    		
	
	
    @Primary
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource comex_DataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean comex_EntityManager() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(comex_DataSource());
        em.setPackagesToScan(
                new String[] { ds_modelPackages });

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto",  env.getProperty(ds_ddlauto));
        properties.put("hibernate.dialect",       env.getProperty(ds_dialect));
        em.setJpaPropertyMap(properties);               

        return em;
    }
    
    @Bean
    @Primary
    public PlatformTransactionManager comex_TransactionManager() {

        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
        		comex_EntityManager().getObject());
        return transactionManager;
    }
}
