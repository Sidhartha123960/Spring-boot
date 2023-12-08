package com.sidhartha.proservice.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Product 
{

	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
       private int id;   
	   
	   @Column
	   private String product_name; 
	    
	   @Column
	   private int product_quantity;

	public Product() {  }

	public Product(int id, String product_name, int product_quantity) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.product_quantity = product_quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", product_name=" + product_name + ", product_quantity=" + product_quantity + "]";
	} 
}