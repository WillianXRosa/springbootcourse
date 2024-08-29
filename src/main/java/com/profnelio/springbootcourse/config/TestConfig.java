package com.profnelio.springbootcourse.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.profnelio.springbootcourse.entities.UserEntity;
import com.profnelio.springbootcourse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository objUserRepository;

	@Override
	public void run(String... args) throws Exception {
		UserEntity u1 = new UserEntity(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		UserEntity u2 = new UserEntity(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		objUserRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
}
