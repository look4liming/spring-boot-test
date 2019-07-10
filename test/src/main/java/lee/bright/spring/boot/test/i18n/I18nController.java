package lee.bright.spring.boot.test.i18n;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class I18nController {
	
	@RequestMapping("/i18nPage")
	public String loginPage() {
		return "i18n/i18nPage";
	}

}
