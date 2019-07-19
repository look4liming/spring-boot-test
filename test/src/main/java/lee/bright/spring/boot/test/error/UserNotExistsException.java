package lee.bright.spring.boot.test.error;

/**
 * @author Bright Lee
 */
public class UserNotExistsException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public UserNotExistsException() {
		super("User not exists!");
	}

}
