package courseEndProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jDemo {

	
Logger logger = LogManager.getLogger(Assignment001Post.class);
	
	@Test
	public void method1()
	{
		System.out.println("this is method1");
		
		logger.trace(" This is trace method");
		
		logger.info(" this is information message");
		
		logger.error(" this is an error message");
		
		logger.fatal(" this is a fatal messgae");
		
		logger.warn(" this is a warning message");
		
		System.out.println("this is end of method1");
	}
}
