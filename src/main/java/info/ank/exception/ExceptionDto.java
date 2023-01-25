package info.ank.exception;

public class ExceptionDto {

	private Integer errorCode;
	
	private String message;

	public ExceptionDto(Integer errorCode, String message) {
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
