package com.sidhartha.mainmicro.feignclient;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sidhartha.mainmicro.entity.Product;


@FeignClient(name = "productservice" , url = "localhost:8896" )
public interface Productfeginclient 
{        
	@GetMapping("/getCus")
	public ResponseEntity<List<Product>> getall();
	
	 @PostMapping
	 public ResponseEntity<Product> createproduct(@RequestBody Product product); 	
}