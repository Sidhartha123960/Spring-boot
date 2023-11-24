package com.sidhartha.splogdb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;


public class App 
{
	 
	 public static final Logger log = LogManager.getLogger(App.class);
	 
    public static void main( String[] args ) throws Exception
    {
    	 System.out.println("Enter your age");
         Scanner sc = new Scanner(System.in);
         int age = sc.nextInt(); 
    	
         if(age>18)
         {
        	
             log.info("eligible for vote"+age);   	 
         }
         else
         {
    
             log.error("not eligible for vote"+age); 
         }     
    }
}