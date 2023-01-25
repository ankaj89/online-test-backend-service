package info.ank.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SET")
public class Sets implements Serializable{
	
	private static final long serialVersionUID = 6655028408941124285L;

	@Id
	  //@GeneratedValue
	  @Column(name = "set_id")
	  private Integer setId ; 
	  
	  @Column(name = "name")
	  private String name ;
	  
	  @Column(name = "created_date")
	  private Date createdDate ;
	  
	  @Column(name = "updated_date")
	  private Date updatedDate ;
	  
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
