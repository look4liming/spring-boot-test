package lee.bright.spring.boot.test.springmvc.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class MyWebMvcConfiguration extends WebMvcConfigurationSupport {
	
	private static final Logger logger = LoggerFactory.getLogger(MyWebMvcConfiguration.class);
	
	public MyWebMvcConfiguration() {
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// TODO
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		// TODO
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		WebRequestInterceptor interceptor = new MyWebRequestInterceptor();
		registry.addWebRequestInterceptor(interceptor);
		logger.info("addInterceptors===>{}", interceptor);
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO
	}

}
