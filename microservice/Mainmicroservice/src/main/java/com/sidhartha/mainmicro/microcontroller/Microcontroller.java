package com.sidhartha.mainmicro.microcontroller;


import java.util.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sidhartha.mainmicro.entity.Customer;
import com.sidhartha.mainmicro.entity.Product;
import com.sidhartha.mainmicro.entity.Rating;
import com.sidhartha.mainmicro.feignclient.Customerfeignclient;
import com.sidhartha.mainmicro.feignclient.Productfeginclient;
import com.sidhartha.mainmicro.feignclient.Ratingfeignclient;
import com.sidhartha.mainmicro.dto.CustomerProductResponse;
import com.sidhartha.mainmicro.dto.CustomerRatingResponse;
import com.sidhartha.mainmicro.dto.CustomerProductwithRatingResponse;



@RestController
@RequestMapping("/Genowti.in")
public class Microcontroller 
{	     
	    @Autowired
	    private Customerfeignclient client1;	
	    
	    @Autowired
	    private Productfeginclient client2; 
	    
	    
	    @Autowired
	    private Ratingfeignclient client3;
	    
	      
	    private Logger keylogger = LoggerFactory.getLogger(Microcontroller.class); 
	    
	    
	    
	    @GetMapping("/getcustomerbyproduct")
	    public ResponseEntity<CustomerProductResponse> getallcustomerwithproduct()
	    {
	    	ResponseEntity<List<Customer>> customerresonse = client1.getbyallcustomer(); 
	    	List<Customer> customers =  customerresonse.getBody(); 
	    	
	    	ResponseEntity<List<Product>> productresponse = client2.getall();
	    	List<Product> products = productresponse.getBody(); 
	    	
	    	
	    	CustomerProductResponse response = new CustomerProductResponse(customers, products);
	    	
	    	return ResponseEntity.status(HttpStatus.OK).body(response);
	    	 	
	    }
	    
	    @GetMapping("/getcustomerbyrating")
	    public ResponseEntity<CustomerRatingResponse> getallcustomerwithrating()
	    {
	        
	    	ResponseEntity<List<Customer>> customerresponse = client1.getbyallcustomer();
	    	List<Customer> customers = customerresponse.getBody();
	    	
	    	ResponseEntity<List<Rating>> ratingresponse = client3.getallRating();
	    	List<Rating> ratings = ratingresponse.getBody();
	    	
	    	CustomerRatingResponse response = new CustomerRatingResponse(customers,ratings);
	    	return ResponseEntity.status(HttpStatus.OK).body(response);   	
	    }    
	   
	    
	    @PostMapping("/createcustomer")
	    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) 
	    {
	       
	    	  ResponseEntity<Customer> res = client1.createcustomer(customer);
	    	  Customer cus = res.getBody();
	    	  return ResponseEntity.status(HttpStatus.ACCEPTED).body(cus); 
	    	  
	    }

	  	      
	   @DeleteMapping("/deletecustomer={id}") 
	   public void deletecustomers(@PathVariable int id)
	   {
		   if(Customer.class!=null)
		   {
			  keylogger.info("it has been deleted......"); 
			  client1.deletebyid(id);		   
		   }
		   else
		   {
		      keylogger.error("Sorry......\tit cann't be deleted");
		   }	    
	   }
	   
	   
	   @PostMapping("/createproduct")
	   public ResponseEntity<Product> createproduct(@RequestBody Product product)
	   {
		   ResponseEntity<Product> products = client2.createproduct(product);
		   Product pro = products.getBody(); 	   
		   return ResponseEntity.status(HttpStatus.ACCEPTED).body(pro);		  		   
	   }
	   
	   @PostMapping("/createrating")
	   public ResponseEntity<Rating> createrating(@RequestBody Rating rating)
	   {
		   
		   ResponseEntity<Rating> ratings  = client3.createrating(rating);		   
		   Rating ra = ratings.getBody();
		   return ResponseEntity.status(HttpStatus.ACCEPTED).body(ra);		   
	   } 
	   
	   
	   @GetMapping("/getcustomer's_info")
	   public ResponseEntity<CustomerProductwithRatingResponse> getallcustomersinfo()
	   {
		    ResponseEntity<List<Customer>> customersresponse = client1.getbyallcustomer();
		     
		    List<Customer> cus = customersresponse.getBody();
		    
		    ResponseEntity<List<Product>> productsresponse = client2.getall();
		    List<Product> pro = productsresponse.getBody();
		    
		    ResponseEntity<List<Rating>> ratingresponse = client3.getallRating();
		    List<Rating> rat = ratingresponse.getBody();
		   
		    CustomerProductwithRatingResponse response = new CustomerProductwithRatingResponse(cus,pro,rat);
		    
		    return ResponseEntity.status(HttpStatus.OK).body(response); 
				   
	   }	       
}