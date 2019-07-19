package lee.bright.spring.boot.test.error;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bright Lee
 */
@RestController
@RequestMapping("/error")
public class UserNotExistsController {
	
	@RequestMapping("/checkUser")
	public String checkUser(@RequestParam String userName) throws UserNotExistsException {
		if ("admin".equals(userName)) {
			throw new UserNotExistsException();
		}
		return "User exists.";
	}

}
