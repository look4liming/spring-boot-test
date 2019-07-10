package lee.bright.spring.boot.test.i18n;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

/**
 * 区域信息解析器，实现国际化。
 * @author Bright Lee
 */
public class MyLocaleResolver implements LocaleResolver {
	
	private static final Logger logger = LoggerFactory.getLogger(MyLocaleResolver.class);

	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		logger.info("resolveLocale===>");
		String L = request.getParameter("L");
		logger.info("locale===>" + L);
		Locale locale = Locale.getDefault();
		if (!StringUtils.isEmpty(L)) {
			String[] a = L.split("_");
			locale = new Locale(a[0], a[1]);
		}
		return locale;
	}

	@Override
	public void setLocale(HttpServletRequest request,
			HttpServletResponse response, Locale locale) {
		logger.info("setLocale===>");
	}

}
