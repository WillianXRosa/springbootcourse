package com.profnelio.springbootcourse.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.profnelio.springbootcourse.entities.CategoryEntity;
import com.profnelio.springbootcourse.services.CategoryService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private CategoryService objCategoryService;
	
	@GetMapping
	public ResponseEntity<List<CategoryEntity>> findAll(){
		List<CategoryEntity> list = objCategoryService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CategoryEntity> findById(@PathVariable Long id){
		CategoryEntity objCategoryEntity = objCategoryService.findById(id);
		return ResponseEntity.ok().body(objCategoryEntity);
		
	}
}
