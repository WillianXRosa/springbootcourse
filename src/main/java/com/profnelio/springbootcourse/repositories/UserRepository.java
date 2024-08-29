package com.profnelio.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profnelio.springbootcourse.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

	
}
