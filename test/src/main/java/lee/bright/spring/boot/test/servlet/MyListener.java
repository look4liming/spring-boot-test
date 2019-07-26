package lee.bright.spring.boot.test.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Bright Lee
 */
public class MyListener implements ServletContextListener {
	
	private static final Logger LOG = LoggerFactory.getLogger(MyListener.class);

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		LOG.info("===================>contextInitialized(ServletContextEvent)");
    }

	@Override
    public void contextDestroyed(ServletContextEvent sce) {
		LOG.info("===================>contextDestroyed(ServletContextEvent)");
    }
    
}
