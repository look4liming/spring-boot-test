package lee.bright.spring.boot.test.config;

import lee.bright.spring.boot.test.config.ConfigurationObject.MyBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Configuration")
public class ConfigurationController {
	
	@Autowired
	private MyBean myBean;
	
	@RequestMapping("/printMyBean")
	public String printMyBean() {
		return myBean.toString();
	}

}
