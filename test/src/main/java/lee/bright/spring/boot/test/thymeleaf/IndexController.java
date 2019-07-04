package lee.bright.spring.boot.test.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	/**
	 * 设置系统默认首页，这样配置返回的页面在templates文件夹下，支持Thymeleaf模板。
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
