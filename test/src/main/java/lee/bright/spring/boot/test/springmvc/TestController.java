package lee.bright.spring.boot.test.springmvc;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot 集成 Spring MVC。
 * @author Bright Lee
 */
@RestController
@RequestMapping("/spring-mvc")
public class TestController {
	
	/**
	 * http://127.0.0.1:1234/spring-boot-test/spring-mvc/hello<br/>
	 * 访问该链接地址，会在浏览器上显示“Hello!”。
	 */
	@RequestMapping("/hello")
	public String hello() {
		return "Hello!";
	}

	/**
	 * http://127.0.0.1:1234/spring-boot-test/spring-mvc/helloUserName/Mike<br/>
	 * 访问该链接地址，会在浏览器上显示“Hello Mike!”。
	 */
	@RequestMapping("/helloUserName/{userName}")
	public String helloUserName(@PathVariable String userName) {
		return "Hello " + userName + "!";
	}

	/**
	 * http://127.0.0.1:1234/spring-boot-test/spring-mvc/helloGender?gender=male<br/>
	 * 访问该链接地址，会在浏览器上显示“Your gender is male.”。
	 */
	@RequestMapping("/helloGender")
	public String helloGender(@RequestParam String gender) {
		return "Your gender is " + gender + ".";
	}
	
	/**
	 * http://127.0.0.1:1234/spring-boot-test/spring-mvc/printRequestHeaderHost<br/>
	 * 访问该链接地址，会在浏览器上显示HTTP请求头信息。
	 */
	@RequestMapping("/printRequestHeaderHost")
	public String printRequestHeaderHost(@RequestHeader("Host") String host) {
		return "Host: " + host;
	}
	
	/**
	 * http://127.0.0.1:1234/spring-boot-test/spring-mvc/printCookieJsessionId<br/>
	 * 访问该链接地址，会在浏览器上显示JSESSIONID的值。
	 */
	@RequestMapping("/printCookieJsessionId")
	public String printCookieJsessionId(@CookieValue("JSESSIONID") String jSessionId) {
		return "JSESSIONID: " + jSessionId;
	}
	
	/**
	 * http://127.0.0.1:1234/spring-boot-test/spring-mvc/printJson<br/>
	 * 访问该链接地址，会在浏览器上显示TestBean对象的JSON字符串。
	 */
	@RequestMapping("printJson")
	public TestBean printJson() {
		TestBean bean = new TestBean();
		bean.setField1("F-1");
		bean.setField2("F-2");
		return bean;
	}
	
	/**
	 * http://127.0.0.1:1234/spring-boot-test/spring-mvc/printTestBean?field1=111&field2=222&field3=333
	 * 访问该链接地址，会在浏览器上显示TestBean对象的JSON字符串，其中已注入了url中出现的参数。
	 */
	@RequestMapping("printTestBean")
	public TestBean printTestBean(TestBean testBean) {
		return testBean;
	}

}
