package com.sidhartha.mainmicro.dto;

import com.sidhartha.mainmicro.entity.Customer;
import com.sidhartha.mainmicro.entity.Product;
import java.util.*;

public class CustomerProductResponse 
{

         private List<Customer> customer;
         private List<Product> product;
		
         public CustomerProductResponse(List<Customer> customer, List<Product> product) 
         {
			super();
			this.customer = customer;
			this.product = product;
		 }

		public List<Customer> getCustomer() {
			return customer;
		}

		public List<Product> getProduct() {
			return product;
		}	
}