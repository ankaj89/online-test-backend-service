package info.ank.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SUBJECT_SET")
public class SubjectSets implements Serializable{
	
	private static final long serialVersionUID = 2514511379988878499L;

	@Id
	 // @GeneratedValue
	  @Column(name = "ts_id")
	  private Integer tsId ;
	  
	  @OneToOne
	  @JoinColumn(name = "set_id", referencedColumnName = "set_id")
	  private Sets set; 
	  
	  @OneToOne
	  @JoinColumn(name = "subject_id", referencedColumnName = "subject_id")
	  private Subject subject ;
	  
	  @Column(name = "created_date")
	  private Date createdDate ;
	  
	  @Column(name = "updated_date")
	  private Date updatedDate ;
	  
	public Integer getTsId() {
		return tsId;
	}
	public void setTsId(Integer tsId) {
		this.tsId = tsId;
	}
	
	public Sets getSet() {
		return set;
	}
	public void setSet(Sets set) {
		this.set = set;
	}
	public Subject getsubject() {
		return subject;
	}
	public void setsubject(Subject subject) {
		this.subject = subject;
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
