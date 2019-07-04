package lee.bright.spring.boot.test.thymeleaf;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
	
	private static final Logger logger = LoggerFactory.getLogger(ThymeleafController.class);
	
	/**
	 * “http://127.0.0.1:1234/spring-boot-test/thymeleaf/hello”<br/>
	 * 返回的字符串代表一个Thymeleaf模板文件的名字。<br/>
	 * 如本例，将自动跳转到classpath:/templates/hello-thymeleaf.html。
	 */
	@RequestMapping("/hello")
	public String hello(Map<String, Object> model) {
		logger.info("hello!!!!!!!");
		
		model.put("name", "Thymeleaf模板引擎");
		
		Person person = new Person();
		person.setName("张三");
		person.setGender("男");
		model.put("person", person);
		
		model.put("h1", "<h1>aaaaaaaaaaaaa</h1>");
		
		return "hello-thymeleaf";
	}
	
	public static class Person {
		
		private String name;
		private String gender;
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getGender() {
			return gender;
		}
		
		public void setGender(String gender) {
			this.gender = gender;
		}
		
	}

}
