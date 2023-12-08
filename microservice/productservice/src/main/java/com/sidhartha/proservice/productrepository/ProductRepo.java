package com.sidhartha.proservice.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sidhartha.proservice.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>
{  }