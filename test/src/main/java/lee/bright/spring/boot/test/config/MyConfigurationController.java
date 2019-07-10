package lee.bright.spring.boot.test.config;

import lee.bright.spring.boot.test.config.MyConfiguration.MyBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Configuration")
public class MyConfigurationController {
	
	@Autowired
	private MyBean myBean;
	
	@RequestMapping("/print")
	public String printMyBean() {
		return myBean.toString();
	}

}
