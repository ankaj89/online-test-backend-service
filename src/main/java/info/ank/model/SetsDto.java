package info.ank.model;

import java.io.Serializable;

public class SetsDto implements Serializable {

	 
	private static final long serialVersionUID = 1L;
	
	  private Integer setId ; 
	  
	  private String name ;

	public Integer getSetId() {
		return setId;
	}

	public void setSetId(Integer setId) {
		this.setId = setId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	  
	  
}
