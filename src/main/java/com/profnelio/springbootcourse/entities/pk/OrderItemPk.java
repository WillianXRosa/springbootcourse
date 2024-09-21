package com.profnelio.springbootcourse.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.profnelio.springbootcourse.entities.OrderEntity;
import com.profnelio.springbootcourse.entities.ProductEntity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPk  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**Attributes**/	
	@ManyToOne
	@JoinColumn(name = "ORDER_ID")
	private OrderEntity order;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private ProductEntity product;
	
	/**Getters and Setters**/
	public OrderEntity getOrder() {
		return order;
	}
	
	public void setOrder(OrderEntity order) {
		this.order = order;
	}
	
	public ProductEntity getProduct() {
		return product;
	}
	
	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	/**HashCode and Equals**/
	@Override
	public int hashCode() {
		return Objects.hash(order, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPk other = (OrderItemPk) obj;
		return Objects.equals(order, other.order) && Objects.equals(product, other.product);
	}
	
	
}
