package caching.springaop;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Sample app that uses Spring AOP for caching
 * 
 * @author Igor Urmincek
 * 
 */
public class App {

	private static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		logger.debug("Starting...");

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		Calculator calc = (Calculator) ctx.getBean("calc");

		// result will be calculated and stored in cache
		logger.info("1 + 2 = " + calc.sum(1, 2));

		// result will be retrieved from cache
		logger.info("1 + 2 = " + calc.sum(1, 2));

		logger.debug("Finished!");
	}

}
