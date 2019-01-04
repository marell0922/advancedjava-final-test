package prob05;

public class PasswordDismatchException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -905940307632914940L;

	@Override
	public String toString() {
		return "비밀번호가 틀렸습니다.";
	}

	
}
