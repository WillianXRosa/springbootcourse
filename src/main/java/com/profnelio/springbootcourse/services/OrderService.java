package com.profnelio.springbootcourse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profnelio.springbootcourse.entities.OrderEntity;
import com.profnelio.springbootcourse.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository objOrderRepository;
	
	public List<OrderEntity> findAll(){
		return objOrderRepository.findAll();
		
	}
	
	public OrderEntity findById(Long id) {
		Optional<OrderEntity> obj = objOrderRepository.findById(id);
		return obj.get();
	}
	
}
