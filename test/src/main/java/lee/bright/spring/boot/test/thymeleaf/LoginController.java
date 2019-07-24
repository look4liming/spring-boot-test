package lee.bright.spring.boot.test.thymeleaf;

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
	public String login(@RequestParam String username, @RequestParam String password) {
		if (username == null || password == null) {
			return "redirect:/loginFailure";
		}
		username = username.trim();
		password = password.trim();
		if (username.length() == 0 || password.length() == 0) {
			return "redirect:/loginFailure";
		}
		return "redirect:/loginSuccess";
	}
	
	@RequestMapping("/loginSuccess")
	public String loginSuccess() {
		return "login/loginSuccess";
	}
	
	@RequestMapping("/loginFailure")
	public String loginFailure() {
		return "login/loginFailure";
	}

}
