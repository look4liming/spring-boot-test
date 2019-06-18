package lee.bright.spring.boot.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationObject {
	
	/**
	 * 往容器中注册一个bean，这个bean的id默认就是方法名（“myBean”）。
	 */
	@Bean
	public MyBean myBean() {
		return new MyBean();
	}
	
	public static class MyBean {
	}

}
