package com.sidhartha.spring.logging.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class LogInfo 
{
	  public static final Logger log = LogManager.getLogger(LogInfo.class);     
	
	  static 
	  {
		  Configurator.setLevel(LogInfo.class.getName(), Level.ERROR);
	  }
	  
	  
     public static void m1()
     {
    	 
    	log.trace("here some trace"); 
        log.info("here some informantion");
        log.warn("here some warning");
        log.debug("here some debug");
        log.fatal("here some fatal");
        log.error("error");
     }	
}