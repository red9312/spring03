package com.example

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

object TestScala {
	
	var log = LogFactory.getLog(TestScala.getClass.getName);
	
	def main(args: Array[String]): Unit = {
		println("Scala execution test...");
		
		log.info("#######################");
		log.info("TestScala Commons logging...");
		log.info("#######################");
		
	}
}