package com.sidhartha.mainmicro.dto;

import com.sidhartha.mainmicro.entity.*;
import java.util.*;

public class CustomerProductwithRatingResponse 
{
     private List<Customer> customers;
    
     private List<Product> products;  	
	 
     private List<Rating> ratings;

     
	public CustomerProductwithRatingResponse(List<Customer> customers, List<Product> products, List<Rating> ratings) {
		super();
		this.customers = customers;
		this.products = products;
		this.ratings = ratings;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Product> getProducts() {
		return products;
	}

	public List<Rating> getRatings() {
		return ratings;
	}
}