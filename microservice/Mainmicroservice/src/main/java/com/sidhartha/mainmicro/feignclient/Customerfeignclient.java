package com.sidhartha.mainmicro.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sidhartha.mainmicro.entity.Customer;

@FeignClient(name = "customerservice" , url = "localhost:8894")
public interface Customerfeignclient 
{

	@GetMapping("/getallcus")
	public ResponseEntity<List<Customer>> getbyallcustomer();      
	
	@DeleteMapping("/deletebyid={id}")
	public void deletebyid(@PathVariable int id);
		
	 @PostMapping("/createcustomer")
     public ResponseEntity<Customer> createcustomer(@RequestBody Customer customer);
		 
}