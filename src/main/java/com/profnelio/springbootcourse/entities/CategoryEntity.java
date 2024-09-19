package com.profnelio.springbootcourse.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "tb_Category")
public class CategoryEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	/**Atributos**/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@Transient
	private Set<ProductEntity> products = new HashSet<>();
	
	/**Getters e Setters**/
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<ProductEntity> getProducts() {
		return products;
	}
	
	/**Construtores**/
	public CategoryEntity() {
		
	}

	public CategoryEntity(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**HashCode and Equals**/
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoryEntity other = (CategoryEntity) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
