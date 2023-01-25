package info.ank.model;

import java.io.Serializable;

public class SubjectDto implements Serializable {

	 
	private static final long serialVersionUID = 1L;
	
	  private Integer subjectId ;
	  
	  private String name ;

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	  
	
}
