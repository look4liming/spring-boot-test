package lee.bright.spring.boot.test.error;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Bright Lee
 */
@ControllerAdvice
public class MyExceptionHandler {
	
	@ExceptionHandler(value = {UserNotExistsException.class})
	public String handleException(Exception e, HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "UserNotExists");
		map.put("message", e.getMessage());
		
		// 传入自己的状态码（否则不会进入错误页面）：
		request.setAttribute("javax.servlet.error.status_code", 500);
		// 把自己的信息放到request中，供ErrorAttributes使用：
		request.setAttribute("extErrorMsg", map);
		// 转发到/error，自适应：
		return "forward:/error";
		// 经过以上3部操作，在浏览器中访问报错，会显示错误页面，在postman中访问，会显示json字符串。
	}

}
