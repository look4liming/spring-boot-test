package lee.bright.spring.boot.test.yml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YmlController {
	
	@Autowired
	private YmlObject ymlObject;
	
	/**
	 * http://127.0.0.1:1234/spring-boot-test/yml<br/>
	 */
	@RequestMapping("/yml")
	public String printYmlObject() {
		StringBuilder buf = new StringBuilder(2048);
		buf.append("string===>").append(ymlObject.getString()).append("<br/>");
		buf.append("date=====>").append(ymlObject.getDate()).append("<br/>");
		buf.append("bool=====>").append(ymlObject.getBool()).append("<br/>");
		buf.append("list=====>").append(ymlObject.getList()).append("<br/>");
		buf.append("set======>").append(ymlObject.getSet()).append("<br/>");
		buf.append("map======>").append(ymlObject.getMap()).append("<br/>");
		buf.append("ymlSubObject.name===>").append(ymlObject.getYmlSubObject().getName()).append("<br/>");
		buf.append("ymlSubObject.age====>").append(ymlObject.getYmlSubObject().getAge()).append("<br/>");
		String s = buf.toString();
		return s;
	}

}
