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
public class MyWebMvcConfigurationSupport extends WebMvcConfigurationSupport {
	
	private static final Logger logger = LoggerFactory.getLogger(MyWebMvcConfigurationSupport.class);
	
	public MyWebMvcConfigurationSupport() {
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		logger.info("addCorsMappings===>");
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		logger.info("addFormatters===>");
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		logger.info("addInterceptors===>");
		WebRequestInterceptor interceptor = new MyWebRequestInterceptor();
		registry.addWebRequestInterceptor(interceptor);
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		logger.info("addResourceHandlers===>");
		registry.addResourceHandler("/**").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/js/jquery/**").addResourceLocations("classpath:/META-INF/resources/js/jquery/");
		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/META-INF/resources/js/");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		logger.info("addViewControllers===>");
		// 发现下面这行被注释掉的代码无效：
		//registry.addViewController("/abcd").setViewName("hello");
	}

}
