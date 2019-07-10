package lee.bright.spring.boot.test.config;

import lee.bright.spring.boot.test.i18n.MyLocaleResolver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

@Configuration
public class I18nConfiguration {
	
	/**
	 * 将我们自定义的国际化解析器注册到框架中。
	 * @return
	 */
	@Bean
	public LocaleResolver localeResolver() {
		return new MyLocaleResolver();
	}

}
