package com.log.home;

import org.apache.logging.log4j.*;


public class Demo {

	private static Logger log =LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
	log.debug("I am debugigng");
	log.info("Object is present");
	log.error("Object is not present");
	
	log.fatal("This is fatal");
}
}
