package info.ank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OnlineTestExceptionController {
	
	 @ExceptionHandler(value = OnlineTestException.class)
	   public ResponseEntity<ExceptionDto> exception(OnlineTestException ex) {
		 ExceptionDto exDto = new ExceptionDto(ex.getErrorCode(),ex.getMessage());
	      return new ResponseEntity<ExceptionDto>(exDto, HttpStatus.NOT_FOUND);
	   }

}
