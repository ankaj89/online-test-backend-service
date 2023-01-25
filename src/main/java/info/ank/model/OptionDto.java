package info.ank.model;

import java.io.Serializable;


public class OptionDto implements Serializable{
	
	  private static final long serialVersionUID = 1L;
	
	  private Integer optionId ;
	    
	  private String name ;

	public Integer getOptionId() {
		return optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	  
	
	 
	  
}
