package com.profnelio.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profnelio.springbootcourse.entities.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>{
	

}
