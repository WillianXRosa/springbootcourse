package com.profnelio.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profnelio.springbootcourse.entities.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{

	
}
