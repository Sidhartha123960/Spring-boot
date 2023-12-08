package com.sidhartha.cusservice.cuscontroller;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sidhartha.cusservice.entity.Customer;
import com.sidhartha.cusservice.servicelayer.Customerservice;
import org.slf4j.*;
import java.util.*;



@RestController
public class CustomerController 
{
	   @Autowired 
	   private Customerservice service;   
	   
	   private Logger logger = LoggerFactory.getLogger(CustomerController.class);
	   
	  
	   @PostMapping("/createcustomer")
       public ResponseEntity<Customer> createcustomer(@RequestBody Customer customer)
       {
		    if(Customer.class!=null)
		    {
		    	Customer cust = service.savecustomer(customer);
		    	logger.info("Found\ndata saved successfully....."); 	    	
		    	return ResponseEntity.status(HttpStatus.ACCEPTED).body(cust); 
		    }
		    else
		    {
		       logger.error("Not found class...it can'nt fetch data"); 	
		    }
			   return null;
       }
	   
	   
	   @GetMapping("/getallcus")
	   public ResponseEntity<List<Customer>> getbyallcustomer()
	   {
		     if(Customer.class!=null)
		     {
		    	 List<Customer> cust = service.getcustomer();
		    	 logger.info("Found\nGet all customer");
		         return ResponseEntity.status(HttpStatus.OK).body(cust);
		     }
		     else
		     {
		    	 logger.error("Not found class.....it can'nt be fetch data....");
		     }   
		         return null;
	    }
	   
	   @GetMapping("/getbyid={id}")
	   public ResponseEntity<Optional<Customer>> getbyid(@PathVariable int id)
	   {
		   if(Customer.class!=null)
		   {
			   Optional<Customer> cust = service.getbyid(id);
			   logger.info("Found\ndetails......");
               return ResponseEntity.status(HttpStatus.OK).body(cust);			   
		   }
		   else
		   {
			   logger.error("not found class....it can'nt be fetch data....");
		   }
                return null;		   
	   }
	   
	   @DeleteMapping("/deletebyid={id}")
	   public void deletebyid(@PathVariable int id)
	   {
		   if(Customer.class!=null)
		   {
			  service.deletebyid(id);
			  logger.info("found");
		   }
		   else
		   {
			  logger.error("not found class. it can'nt be deleted....."); 
		   }     
	   }
}	   