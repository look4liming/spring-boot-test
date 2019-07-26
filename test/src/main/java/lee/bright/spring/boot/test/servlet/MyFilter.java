package lee.bright.spring.boot.test.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author Bright Lee
 */
public class MyFilter implements Filter {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.getWriter().write("MyFilter 111\n");
		chain.doFilter(request, response);
		response.getWriter().write("MyFilter 222\n");
	}

}
