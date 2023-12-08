package com.sidhartha.mainmicro.feignclient;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sidhartha.mainmicro.entity.Rating;

@FeignClient(name = "ratingservice" , url = "localhost:8867" )
public interface Ratingfeignclient {

	@GetMapping("/getallrating")
	public ResponseEntity<List<Rating>> getallRating();	  
	
	@PostMapping
    public ResponseEntity<Rating> createrating(@RequestBody Rating rating);
}