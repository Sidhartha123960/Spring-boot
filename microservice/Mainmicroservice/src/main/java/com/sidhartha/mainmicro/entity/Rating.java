package com.sidhartha.mainmicro.entity;

public class Rating {

	
	private int id;    

	private int customer_rating;	

	private String message;

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rating(int id, int customer_rating, String message) {
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
	public String toString() {
		return "Rating [id=" + id + ", customer_rating=" + customer_rating + ", message=" + message + "]";
	}	
}