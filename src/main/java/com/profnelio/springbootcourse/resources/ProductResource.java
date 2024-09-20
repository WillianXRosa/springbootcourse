package com.profnelio.springbootcourse.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.profnelio.springbootcourse.entities.ProductEntity;
import com.profnelio.springbootcourse.services.ProductService;


@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService objProductService;
	
	@GetMapping
	public ResponseEntity<List<ProductEntity>> findAll(){
		List<ProductEntity> list = objProductService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProductEntity> findById(@PathVariable Long id){
		ProductEntity objProductEntity = objProductService.findById(id);
		return ResponseEntity.ok().body(objProductEntity);
		
	}
}
