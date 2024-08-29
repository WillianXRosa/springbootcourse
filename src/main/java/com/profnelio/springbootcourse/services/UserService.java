package com.profnelio.springbootcourse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profnelio.springbootcourse.entities.UserEntity;
import com.profnelio.springbootcourse.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository objUserRepository;
	
	public List<UserEntity> findAll(){
		return objUserRepository.findAll();
		
	}
	
	public UserEntity findById(Long id) {
		Optional<UserEntity> obj = objUserRepository.findById(id);
		return obj.get();
	}
	
}
