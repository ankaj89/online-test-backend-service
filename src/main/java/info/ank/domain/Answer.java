package info.ank.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ANSWER")
public class Answer implements Serializable{
	
	private static final long serialVersionUID = -4009670438836983998L;

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name = "ans_id")
	  private Integer answerId ;
	  
	  @OneToOne
	  @JoinColumn(name = "opt_id", referencedColumnName = "opt_id")
	  private Option option ;
	  
	  @OneToOne
	  @JoinColumn(name = "ques_id")
	  private Question question ;
	 
	  @Column(name = "created_date")
	  private Date createdDate ;
	  
	  @Column(name = "updated_date")
	  private Date updatedDate ;

	public Integer getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
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

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	  
	

}
