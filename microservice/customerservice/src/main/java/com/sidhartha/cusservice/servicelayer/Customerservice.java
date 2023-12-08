package com.sidhartha.cusservice.servicelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sidhartha.cusservice.Repository.CustomerRepo;
import com.sidhartha.cusservice.entity.Customer;
import java.util.*;


@Service
public class Customerservice 
{
     @Autowired 
	 private CustomerRepo repo;  
	
     public Customer savecustomer(Customer customer)
     {
    	  return repo.save(customer);
     }
     
     public List<Customer> getcustomer()
     {
    	  return repo.findAll(); 
     } 
     
     public Optional<Customer> getbyid(int id)
     {
         return repo.findById(id);
     }
     
     public void deletebyid(int id)
     {
    	  repo.deleteById(id);
     }    
} 