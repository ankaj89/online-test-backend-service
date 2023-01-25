package info.ank.exception;

public class OnlineTestException extends RuntimeException  {
	
	
	private static final long serialVersionUID = 6858250177958359102L;

	private Integer errorCode;
	
	private String message;

	public OnlineTestException(Integer errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public String getMessage() {
		return message;
	}

}
