package lee.bright.spring.boot.test.servlet;

import java.util.Arrays;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Bright Lee
 */
@Configuration
public class ServletConfig {
	
	@Bean
	public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
		return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
			@Override
			public void customize(ConfigurableWebServerFactory factory) {
				// 在这里通过调用factory的方法完成对WEB容器的配置。。。
			}
		};
	}
	
	// 注册Servlet：
	@Bean
	public ServletRegistrationBean<MyServlet> myServlet() {
		ServletRegistrationBean<MyServlet> servletRegistrationBean = 
				new ServletRegistrationBean<MyServlet>(new MyServlet(), "/myServlet");
		return servletRegistrationBean;
	}
	
	// 注册Filter：
	@Bean
	public FilterRegistrationBean<MyFilter> myFilter() {
		FilterRegistrationBean<MyFilter> filterRegistrationBean = 
				new FilterRegistrationBean<MyFilter>(new MyFilter());
		filterRegistrationBean.setUrlPatterns(Arrays.asList("/myServlet"));
		return filterRegistrationBean;
	}
	
	// 注册Listener：
	@Bean
	public ServletListenerRegistrationBean<MyListener> myListener() {
		ServletListenerRegistrationBean<MyListener> servletListenerRegistrationBean = 
				new ServletListenerRegistrationBean<MyListener>(new MyListener());
		servletListenerRegistrationBean.setEnabled(true);
		return servletListenerRegistrationBean;
	}

}
