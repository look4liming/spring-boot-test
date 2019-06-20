package lee.bright.spring.boot.test.logback;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logback")
public class LogbackController {
	
	private static final Logger LOG = LoggerFactory.getLogger(LogbackController.class);
	
	@RequestMapping("/log")
	public String log() {
		Date date = new Date();
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		LOG.debug("debug======>time: {}", time);
		LOG.info( "info=======>time: {}", time);
		LOG.warn( "warn=======>time: {}", time);
		LOG.error("error======>time: {}", time);
		return "日志记录完毕！";
	}
	
}
