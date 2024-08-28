package com.profnelio.springbootcourse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.profnelio.springbootcourse.entities.UserEntity;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<UserEntity> findAll(){
		UserEntity objUserEntity = new UserEntity(1L,"Maria", "maria@gmail.com","999999999","12345");
		return ResponseEntity.ok().body(objUserEntity);
	}
}
