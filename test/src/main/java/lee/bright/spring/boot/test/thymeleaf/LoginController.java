package lee.bright.spring.boot.test.thymeleaf;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/loginPage")
	public String loginPage() {
		return "login/loginPage";
	}
	
	@RequestMapping("login")
	public String login(@RequestParam String username, @RequestParam String password, Map<String, Object> model) {
		if (username == null || password == null) {
			return "login/loginFailure";
		}
		username = username.trim();
		password = password.trim();
		if (username.length() == 0 || password.length() == 0) {
			return "login/loginFailure";
		}
		model.put("username", username);
		return "login/loginSuccess";
	}

}
