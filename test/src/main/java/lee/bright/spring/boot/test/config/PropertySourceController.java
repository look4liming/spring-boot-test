package lee.bright.spring.boot.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/PropertySource")
@RestController
public class PropertySourceController {
	
	@Autowired
	private PropertySourceObject obj;
	
	@RequestMapping("/print")
	public String printUsername() {
		return "username============>" + obj.getUsername();
	}

}
