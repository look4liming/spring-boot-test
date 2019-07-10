package lee.bright.spring.boot.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Value")
@RestController
public class MyValueController {
	
	@Autowired
	private MyValue obj;
	
	@RequestMapping("/print")
	public String printUsername() {
		return obj.toString();
	}

}
