package com.sidhartha.ratservice.ratingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sidhartha.ratservice.ratingRepo.RatRepo;
import com.sidhartha.ratservice.entity.Rating;
import java.util.*;



@Service
public class Ratservice 
{
        
	    @Autowired 
	    private RatRepo repo; 
	
	    public Rating createRating(Rating rating)
	    {
	       return repo.save(rating);	    	
	    }	
	    
	    
	    public List<Rating> getallrating()
	    {
	         return repo.findAll();  	
	    }
	    
}