package info.ank.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUBJECT")
public class Subject implements Serializable{
	
	private static final long serialVersionUID = 6715426481216118563L;

	@Id
	 // @GeneratedValue( strategy =GenerationType.AUTO)
	  @Column(name = "subject_id")
	  private Integer subjectId ;
	  
	  @Column(name = "name")
	  private String name ;
	  
	  @Column(name = "created_date")
	  private Date createdDate ;
	  
	  @Column(name = "updated_date")
	  private Date updatedDate ;
	  
	public synchronized Integer getSubjectId() {
		return subjectId;
	}
	public synchronized void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	  
	
	  
}
