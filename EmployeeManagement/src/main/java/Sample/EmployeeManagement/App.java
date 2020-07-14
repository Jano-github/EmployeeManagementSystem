package Sample.EmployeeManagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Employee Management System
 *
 */

@SpringBootApplication
public class App 
{
	
	private static Logger logger    = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	logger.info("inside main");
    	SpringApplication.run(App.class, args);
    }
}
