package com.profnelio.springbootcourse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profnelio.springbootcourse.entities.CategoryEntity;
import com.profnelio.springbootcourse.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository objCategoryRepository;
	
	public List<CategoryEntity> findAll(){
		return objCategoryRepository.findAll();
		
	}
	
	public CategoryEntity findById(Long id) {
		Optional<CategoryEntity> obj = objCategoryRepository.findById(id);
		return obj.get();
	}
	
}
