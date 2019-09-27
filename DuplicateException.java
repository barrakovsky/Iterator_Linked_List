
@SuppressWarnings("serial")
public class DuplicateException extends Exception {

	public DuplicateException() {
		super("\nThrowing DuplicateException: This ISBN already exist in our tracking system.\n");
	}



}
