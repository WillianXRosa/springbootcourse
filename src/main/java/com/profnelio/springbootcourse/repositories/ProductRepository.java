package com.profnelio.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profnelio.springbootcourse.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{

	

	
}
