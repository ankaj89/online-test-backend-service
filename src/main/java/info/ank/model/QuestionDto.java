package info.ank.model;

import java.io.Serializable;
import java.util.List;

public class QuestionDto implements Serializable {

		
	private static final long serialVersionUID = -3981883273509390272L;

	  private Integer questionId ; 
	
	  private String name ;
	 
	  private List<OptionDto> options;
	  
	  private SubjectSetsDto subjectSet ;
	 
	  private AnswerDto answer;

	public Integer getQuestionId() {
		return questionId;
	}

	public SubjectSetsDto getSubjectSet() {
		return subjectSet;
	}

	public void setSubjectSet(SubjectSetsDto subjectSet) {
		this.subjectSet = subjectSet;
	}

	public List<OptionDto> getOptions() {
		return options;
	}

	public void setOptions(List<OptionDto> options) {
		this.options = options;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AnswerDto getAnswer() {
		return answer;
	}

	public void setAnswer(AnswerDto answer) {
		this.answer = answer;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

			  
}
