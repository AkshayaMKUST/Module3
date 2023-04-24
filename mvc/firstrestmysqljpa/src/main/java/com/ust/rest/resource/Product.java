package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Product {
	
	@Id
	@GeneratedValue
	/*AUTO is the default generation type or strategy
	Generation Type is a strategy which the JPA should use or 
	follow to generate primary key values when the strategy is not specified 
	jpa uses auto strategy.
	When the underlying database is mysql, generationtype.auto means the jpa 
	will create a hibernate sequence in the database or generation of primary keys*/ 
	
//	select next_val as id_val from hibernate_sequence for update
//	Hibernate: update hibernate_sequence set next_val= ? where next_val=?
//	Hibernate: insert into product (description, name, price, qty, product_id) values (?, ?, ?, ?, ?
	
	private long productId;
	private String name;
	private String description;
	private BigDecimal price;
	private int qty;
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}