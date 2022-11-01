package com.flw_import.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
//import org.springframework.stereotype.Repository;



@NoRepositoryBean
//public interface ReadOnlyRepository<T, ID, Username> extends Repository<T, ID> {
public interface ReadOnlyRepository<T, ID> extends Repository<T, ID> {
 
   // List<T> findAllByUsername(ID id);
    //Optional<List<T>> findByUsername(ID id);
	List<T> findByUsername(ID id);
    List<T> findByUsernameOrderByUsername(ID id);
    //List<User> findByLastname(String lastname);
    
    
    List<T> findAll();
 
    List<T> findAll(Sort sort);
 
    Page<T> findAll(Pageable pageable);
 
    Optional<T> findById(ID id);
     
    long count();
}