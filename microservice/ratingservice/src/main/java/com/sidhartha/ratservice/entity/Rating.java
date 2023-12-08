package com.sidhartha.ratservice.entity;

import jakarta.persistence.*;

@Entity
public class Rating 
{

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;    
	
	  @Column
      private int customer_rating;	
	
	  @Column
      private String message;

	public Rating() { }

	public Rating(int id, int customer_rating, String message) 
	{
		super();
		this.id = id;
		this.customer_rating = customer_rating;
		this.message = message;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomer_rating() {
		return customer_rating;
	}

	public void setCustomer_rating(int customer_rating) {
		this.customer_rating = customer_rating;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	@Override
	public String toString() 
	{
		return "Rating [id=" + id + ", customer_rating=" + customer_rating + ", message=" + message + "]";
	}  
	  
}