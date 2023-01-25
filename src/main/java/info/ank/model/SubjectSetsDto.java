package info.ank.model;

import java.io.Serializable;

public class SubjectSetsDto implements Serializable {

	 
	private static final long serialVersionUID = 1L;
	
	  private Integer tsId ;
	  
	  private SetsDto set; 
	  
	  private SubjectDto subject ;

	public Integer getTsId() {
		return tsId;
	}

	public void setTsId(Integer tsId) {
		this.tsId = tsId;
	}

	public SetsDto getSet() {
		return set;
	}

	public void setSet(SetsDto set) {
		this.set = set;
	}

	public SubjectDto getSubject() {
		return subject;
	}

	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}
	
}
