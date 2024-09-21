package com.profnelio.springbootcourse.entities;

import java.io.Serializable;
import java.util.Objects;

import com.profnelio.springbootcourse.entities.pk.OrderItemPk;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ORDER_ITEM")
public class OrderItemEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/**Attributes**/
	@EmbeddedId
	private OrderItemPk ID;
	
	private Integer QUANTITY;
	private Double PRICE;
	
	/**Getters and Setters**/
	public OrderEntity getOrder() {
		return ID.getOrder();
	}
	
	private void setOrder(OrderEntity order) {
		ID.setOrder(order);
		
	}
	
	public ProductEntity getProductEntity() {
		return ID.getProduct();
	}
	
	public void setProduct(ProductEntity product) {
		ID.setProduct(product);
	}
	
	
	
	public OrderItemPk getID() {
		return ID;
	}
	
	public void setID(OrderItemPk id) {
		ID = id;
	}
	
	public Integer getQUANTITY() {
		return QUANTITY;
	}
	
	public void setQUANTITY(Integer quantity) {
		QUANTITY = quantity;
	}
	
	public Double getPRICE() {
		return PRICE;
	}
	
	public void setPRICE(Double price) {
		PRICE = price;
	}
	
	
	/**Constructors Super Class and Using Fields**/
	public OrderItemEntity() {
		super();
		
	}

	public OrderItemEntity(OrderEntity order, ProductEntity product, Integer quantity, Double price) {
		super();
		ID.setOrder(order);
		ID.setProduct(product);
		QUANTITY = quantity;
		PRICE = price;
	}
	
	
	/**HashCode and Equals**/
	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemEntity other = (OrderItemEntity) obj;
		return Objects.equals(ID, other.ID);
	}
	
	
	
	
}
