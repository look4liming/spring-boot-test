package lee.bright.spring.boot.test.springmvc.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

public class MyWebRequestInterceptor implements WebRequestInterceptor {
	
	private static final Logger logger = LoggerFactory.getLogger(MyWebRequestInterceptor.class);

	@Override
	public void preHandle(WebRequest request) throws Exception {
		logger.info("preHandle...");
	}

	@Override
	public void postHandle(WebRequest request, ModelMap modelMap) throws Exception {
		logger.info("postHandle...");
	}

	@Override
	public void afterCompletion(WebRequest request, Exception exception)
			throws Exception {
		logger.info("afterCompletion...");
		String abc = request.getParameter("abc");
		logger.info("abc===>{}", abc);
	}

}
