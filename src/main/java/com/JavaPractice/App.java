package com.JavaPractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	String message = "Hello World";
    	LOG.debug(message + "will Be Printrd On Debug");
    	LOG.info(message + "will Be Printrd On Info");
    	LOG.warn(message + "will Be Printrd On Warn");
    	LOG.error(message + "will Be Printrd On Error");
    	LOG.fatal(message + "will Be Printrd On Fatal");
    	LOG.info("Appending string: {}.", message);
        System.out.println(message);
        System.out.println(message);
       
    }
}