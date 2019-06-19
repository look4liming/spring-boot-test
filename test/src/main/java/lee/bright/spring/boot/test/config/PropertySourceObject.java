package lee.bright.spring.boot.test.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"classpath:PropertySource.properties"})
@ConfigurationProperties(prefix="user")
public class PropertySourceObject {
	
	private String username;
	
	public PropertySourceObject() {
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

}
