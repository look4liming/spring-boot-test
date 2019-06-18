package lee.bright.spring.boot.test.config;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * “@ConfigurationProperties”注解告诉框架把application.yml配置文件中的配置信息注入到该类的实例中来。<br/>
 * “@Component”使得改类的实例可以被注入到别的对象中。
 */
@Component
@ConfigurationProperties(prefix="yml-object")
public class YmlObject {
	
	private String string;
	private Date date;
	private Boolean bool;
	private List<String> list;
	private Set<String> set;
	private Map<String, Object> map;
	private YmlSubObject ymlSubObject;
	
	public YmlObject() {
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getBool() {
		return bool;
	}

	public void setBool(Boolean bool) {
		this.bool = bool;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public YmlSubObject getYmlSubObject() {
		return ymlSubObject;
	}

	public void setYmlSubObject(YmlSubObject ymlSubObject) {
		this.ymlSubObject = ymlSubObject;
	}
	
	public static class YmlSubObject {
		
		private String name;
		private int age;
		
		public YmlSubObject() {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	}

}
