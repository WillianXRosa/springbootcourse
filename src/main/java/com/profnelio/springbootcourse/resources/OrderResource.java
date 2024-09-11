package com.profnelio.springbootcourse.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.profnelio.springbootcourse.entities.OrderEntity;
import com.profnelio.springbootcourse.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService objOrderService;
	
	@GetMapping
	public ResponseEntity<List<OrderEntity>> findAll(){
		List<OrderEntity> list = objOrderService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<OrderEntity> findById(@PathVariable Long id){
		OrderEntity objOrderEntity = objOrderService.findById(id);
		return ResponseEntity.ok().body(objOrderEntity);
		
	}
}
