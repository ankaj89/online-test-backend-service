package info.ank.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "QUESTION")
public class Question implements Serializable {

	private static final long serialVersionUID = 5883428670893747629L;

	 @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name = "ques_id")
	  private Integer questionId ; 
	  
	  @OneToOne
	  @Cascade(CascadeType.ALL)
	  @JoinColumn(name = "ts_id", referencedColumnName = "ts_id")
	  private SubjectSets subjectSet ;
	  
	 
	  @OneToMany
	  @JoinColumn(name = "ques_id", referencedColumnName = "ques_id",nullable=false)
	  @Cascade(CascadeType.ALL)
	  @Fetch(FetchMode.SUBSELECT)
	  private List<Option> options;
	  
	 // @OneToOne//( fetch = FetchType.LAZY,orphanRemoval = true)
	  //@JoinColumn(name = "ques_id", referencedColumnName = "ques_id")
	  @Cascade(CascadeType.ALL)
	  @OneToOne( mappedBy = "question")
	  private Answer answer;
	  
	  @Column(name = "name")
	  private String name ;
	  
	  @Column(name = "created_date")
	  private Date createdDate ;
	  
	  @Column(name = "updated_date")
	  private Date updatedDate ;

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public SubjectSets getSubjectSet() {
		return subjectSet;
	}

	public void setSubjectSet(SubjectSets subjectSet) {
		this.subjectSet = subjectSet;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
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
