package lee.bright.spring.boot.test.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring boot 集成 Spring MVC。
 * @author Bright Lee
 */
@Controller
@RequestMapping("/spring-mvc")
public class TestController {
	
	/**
	 * http://127.0.0.1:1234/spring-boot-test/spring-mvc/hello<br/>
	 * 访问该链接地址，会在浏览器上显示“Hello!”。
	 */
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello!";
	}

	/**
	 * http://127.0.0.1:1234/spring-boot-test/spring-mvc/helloUser/Mike<br/>
	 * 访问该链接地址，会在浏览器上显示“Hello Mike!”。
	 */
	@RequestMapping("/helloUser/{userName}")
	@ResponseBody
	public String helloUser(@PathVariable String userName) {
		return "Hello " + userName + "!";
	}

	/**
	 * http://127.0.0.1:1234/spring-boot-test/spring-mvc/helloGender?gender=male<br/>
	 * 访问该链接地址，会在浏览器上显示“Your gender is male.”。
	 */
	@RequestMapping("/helloGender")
	@ResponseBody
	public String helloGender(@RequestParam String gender) {
		return "Your gender is " + gender + ".";
	}
	
	/**
	 * http://127.0.0.1:1234/spring-boot-test/spring-mvc/printRequestHeaderHost<br/>
	 * 访问该链接地址，会在浏览器上显示HTTP请求头信息。
	 */
	@RequestMapping("/printRequestHeaderHost")
	@ResponseBody
	public String printRequestHeaderHost(@RequestHeader("Host") String host) {
		return "Host: " + host;
	}
	
	/**
	 * http://127.0.0.1:1234/spring-boot-test/spring-mvc/printCookieJsessionId<br/>
	 * 访问该链接地址，会在浏览器上显示JSESSIONID的值。
	 */
	@RequestMapping("/printCookieJsessionId")
	@ResponseBody
	public String printCookieJsessionId(@CookieValue("JSESSIONID") String jSessionId) {
		return "JSESSIONID: " + jSessionId;
	}

}
