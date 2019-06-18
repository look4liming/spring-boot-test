package lee.bright.spring.boot.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/PropertySourceTest")
@RestController
public class PropertySourceController {
	
	@Autowired
	private PropertySourceObject obj;
	
	@RequestMapping("/printUsername")
	public String printUsername() {
		return obj.toString();
	}

}
