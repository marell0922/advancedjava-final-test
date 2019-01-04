package prob05;

public class UserNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8122872053597427007L;

	@Override
	public String toString() {
		return "존재하지 않는 사용자입니다.";
	}

	
}
