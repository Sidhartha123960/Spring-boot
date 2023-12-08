package com.sidhartha.proservice.handlingservice;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sidhartha.proservice.productrepository.ProductRepo;
import com.sidhartha.proservice.entity.Product;


@Service
public class Handleservice 
{
	@Autowired
	private ProductRepo repo;

	public Product createproduct(Product product) {
		return repo.save(product);
	}
    
    public List<Product> getallproduct()
    {
    	return repo.findAll();
    }	
}