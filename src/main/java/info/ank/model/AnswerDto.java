package info.ank.model;

import java.io.Serializable;


public class AnswerDto implements Serializable {

	  private static final long serialVersionUID = 1L;

	  private Integer answerId ;
	  
	  private OptionDto option ;
	  
	  

	public Integer getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public OptionDto getOption() {
		return option;
	}

	public void setOption(OptionDto option) {
		this.option = option;
	}
	
	
}
