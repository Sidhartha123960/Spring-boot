package com.sidhartha.proservice.productcontroller;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sidhartha.proservice.entity.Product;
import com.sidhartha.proservice.handlingservice.Handleservice;
import java.util.*;


@RestController
public class ProductController 
{
	  @Autowired
      private Handleservice service;
	  
	  private Logger keylogger = LoggerFactory.getLogger(ProductController.class);
	  
	  @PostMapping
	  public ResponseEntity<Product> createproduct(@RequestBody Product product)
	  {
		  if(Product.class!=null)
		  {  
			  Product cropo = service.createproduct(product);
			  keylogger.info("Found....\nYour product is ready....\nCreated......");
			  return ResponseEntity.status(HttpStatus.ACCEPTED).body(cropo);   
		  }
		  else
		  {
			  keylogger.error("Not found class...\nPlease try again......");
		  }  
		     return null;
	  }
	  
	  @GetMapping("/getCus")
	  public ResponseEntity<List<Product>> getall()
	  {
		  return ResponseEntity.status(HttpStatus.OK).body(service.getallproduct());  
	  
	  }
	  
}