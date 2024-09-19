package com.profnelio.springbootcourse.config;

import java.time.Instant;

import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.profnelio.springbootcourse.entities.CategoryEntity;
import com.profnelio.springbootcourse.entities.OrderEntity;
import com.profnelio.springbootcourse.entities.ProductEntity;
import com.profnelio.springbootcourse.entities.UserEntity;
import com.profnelio.springbootcourse.entities.enums.OrderStatus;
import com.profnelio.springbootcourse.repositories.CategoryRepository;
import com.profnelio.springbootcourse.repositories.OrderRepository;
import com.profnelio.springbootcourse.repositories.ProductRepository;
import com.profnelio.springbootcourse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository objUserRepository;
	
	@Autowired
	private OrderRepository objOrderRepository;
	
	@Autowired
	private CategoryRepository objCategoryRepository;
	
	@Autowired
	private ProductRepository objProductRepository;
	
	


	@Override
	public void run(String... args) throws Exception {
		
		CategoryEntity cat1 = new CategoryEntity(null, "Electronics");
		CategoryEntity cat2 = new CategoryEntity(null, "Books");
		CategoryEntity cat3 = new CategoryEntity(null, "Computers");
		
		UserEntity u1 = new UserEntity(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		UserEntity u2 = new UserEntity(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		OrderEntity o1 = new OrderEntity(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID, u1);
		OrderEntity o2 = new OrderEntity(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT,u2);
		OrderEntity o3 = new OrderEntity(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT,u1);
		
		ProductEntity p1 = new ProductEntity(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		ProductEntity p2 = new ProductEntity(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		ProductEntity p3 = new ProductEntity(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		ProductEntity p4 = new ProductEntity(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		ProductEntity p5 = new ProductEntity(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		objUserRepository.saveAll(Arrays.asList(u1,u2));
		objOrderRepository.saveAll(Arrays.asList(o1,o2,o3));
		objCategoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		objProductRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
	}
	
	
}
