package com.sidhartha.cusservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sidhartha.cusservice.entity.*;

public interface CustomerRepo extends JpaRepository<Customer,Integer>  
{  }