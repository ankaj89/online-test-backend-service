package info.ank.model;

import java.util.List;

public class QuestionWrapperDto {
	
	private List<QuestionDto> questionDto;
	
	private Integer totalElements;
	
	private Integer pageSize;
	
	private Integer totalPages;
	
	private Integer offset;
	
	public List<QuestionDto> getQuestionDto() {
		return questionDto;
	}

	public void setQuestionDto(List<QuestionDto> questionDto) {
		this.questionDto = questionDto;
	}

	public Integer getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	

}
