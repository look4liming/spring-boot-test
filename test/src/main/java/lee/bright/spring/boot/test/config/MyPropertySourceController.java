package lee.bright.spring.boot.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/PropertySource")
@RestController
public class MyPropertySourceController {
	
	@Autowired
	private MyPropertySource obj;
	
	@RequestMapping("/print")
	public String printUsername() {
		return "username============>" + obj.getUsername();
	}

}
