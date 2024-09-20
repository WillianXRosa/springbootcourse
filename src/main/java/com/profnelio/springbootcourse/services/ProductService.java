package com.profnelio.springbootcourse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profnelio.springbootcourse.entities.ProductEntity;
import com.profnelio.springbootcourse.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository objProductRepository;
	
	public List<ProductEntity> findAll(){
		return objProductRepository.findAll();
		
	}
	
	public ProductEntity findById(Long id) {
		Optional<ProductEntity> obj = objProductRepository.findById(id);
		return obj.get();
	}
	
}
