package com.sidhartha.ratservice.ratingController;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ReactiveAdapter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sidhartha.ratservice.entity.Rating;
import com.sidhartha.ratservice.ratingservice.Ratservice;


import java.util.*;

@RestController
public class RatController 
{
	  @Autowired  
      private  Ratservice service;
		  
	  private Logger keylogger = LoggerFactory.getLogger(RatController.class);
	  
	  
	  @PostMapping
      public ResponseEntity<Rating> createrating(@RequestBody Rating rating)
      {
          if(Rating.class!=null)
          {
        	       keylogger.info("Rating class Found\n....");  
        	       return ResponseEntity.
       			   status(HttpStatus.ACCEPTED).
       			   body(service.createRating(rating));
        	    	  
          }
          else
          {
        	       keylogger.error("Rating class not found...\nplease try again.....");        	  
          }
                    return null; 	  
      }
	  
	  
	  @GetMapping("/getallrating")
	  public ResponseEntity<List<Rating>> getallRating()
	  {
	  	  if(Rating.class!=null)
	  	  {
	  		  keylogger.info("class Found....\nDone....");
	  		  return ResponseEntity.status(HttpStatus.OK).body(service.getallrating());
	  	  }
	  	  else
	  	  {
	  		  keylogger.error("Class Not found\nPlease try again");
	  	  }
		        return null;
	  }  
}