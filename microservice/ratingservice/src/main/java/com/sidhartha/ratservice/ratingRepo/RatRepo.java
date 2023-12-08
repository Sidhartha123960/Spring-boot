package com.sidhartha.ratservice.ratingRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sidhartha.ratservice.entity.Rating;

public interface RatRepo extends JpaRepository<Rating, Integer> 
{  }
