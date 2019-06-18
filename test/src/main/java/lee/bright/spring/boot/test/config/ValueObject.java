package lee.bright.spring.boot.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="user")
public class ValueObject {
	
	@Value("${yml-object.string}")
	private String annotatedString;
	@Value("#{11*6}")
	private int annotatedAge;
	@Value("true")
	private boolean annotatedBoolean;
	
	public ValueObject() {
	}

	public String getAnnotatedString() {
		return annotatedString;
	}

	public void setAnnotatedString(String annotatedString) {
		this.annotatedString = annotatedString;
	}

	public int getAnnotatedAge() {
		return annotatedAge;
	}

	public void setAnnotatedAge(int annotatedAge) {
		this.annotatedAge = annotatedAge;
	}

	public boolean isAnnotatedBoolean() {
		return annotatedBoolean;
	}

	public void setAnnotatedBoolean(boolean annotatedBoolean) {
		this.annotatedBoolean = annotatedBoolean;
	}
	
	public String toString() {
		return "annotatedString is: " + annotatedString + 
				", annotatedAge is: " + annotatedAge + 
				", annotatedBoolean is: " + annotatedBoolean;
	}

}
