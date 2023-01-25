package info.ank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import info.ank.domain.Question;
import info.ank.mapper.OnlineTestQuestionMapper;
import info.ank.model.QuestionWrapperDto;
import info.ank.repository.QuestionRepository;

@Service
public class OnlineTestService {
	
	@Autowired
	public QuestionRepository questionRepository;
	
	@Autowired
	public OnlineTestQuestionMapper mapper;
	
	
	public QuestionWrapperDto getQuestionsBySubjectAndSetID(Integer topicId,Integer setsId,Integer offset,Integer pageSize) {
		
    	Page<Question> domainQuestionPage= questionRepository.findBySubjectSet_Subject_SubjectIdAndSubjectSet_set_setId(topicId,setsId,PageRequest.of(offset, pageSize));
    	return mapper.populateQuestionWrapperFromDto(domainQuestionPage);
    }
    
    

}
