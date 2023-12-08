package com.sidhartha.mainmicro.dto;
  
import com.sidhartha.mainmicro.entity.Rating;
import java.util.*;
import com.sidhartha.mainmicro.entity.Customer;


public class CustomerRatingResponse {

	   private List<Customer> customer;  
 	   private List<Rating> rating;
	public CustomerRatingResponse(List<Customer> customer, List<Rating> rating) {
		super();
		this.customer = customer;
		this.rating = rating;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public List<Rating> getRating() {
		return rating;
	}	
}