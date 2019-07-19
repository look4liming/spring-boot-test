package lee.bright.spring.boot.test.error;

import java.util.Map;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

/**
 * @author Bright Lee
 */
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {
	
	@Override
	public Map<String, Object> getErrorAttributes(WebRequest webRequest,
			boolean includeStackTrace) {
		Map<String, Object> map = super.getErrorAttributes(webRequest, includeStackTrace);
		
		// MyExceptionHandler中设置的错误信息：
		@SuppressWarnings("unchecked")
		Map<String, Object> extErrorMsg = (Map<String, Object>) webRequest.getAttribute(
				"extErrorMsg", RequestAttributes.SCOPE_REQUEST);
		map.put("extErrorMsg", extErrorMsg);
		
		return map;
	}

}
