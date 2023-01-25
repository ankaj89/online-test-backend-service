package info.ank.mapper;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import info.ank.domain.Question;
import info.ank.model.QuestionDto;
import info.ank.model.QuestionWrapperDto;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@Service
public class OnlineTestQuestionMapper {
	
	
	public List<QuestionDto>  mapperQuestionDomainToDtoAsList(List<Question> question) {
		
		DefaultMapperFactory mapperFactory=new DefaultMapperFactory.Builder().build();
		mapperFactory.classMap(Question.class, QuestionDto.class).exclude("answer").exclude("subjectSet").byDefault().register();
	
	    return mapperFactory.getMapperFacade().mapAsList(question, QuestionDto.class);
	}
	
    public List<Question>  mapperQuestionDtoToDomain(List<QuestionDto> questionDto) {
		
		DefaultMapperFactory mapperFactory=new DefaultMapperFactory.Builder().build();
		mapperFactory.classMap(QuestionDto.class, Question.class).byDefault().register();
	
	    return mapperFactory.getMapperFacade().mapAsList(questionDto, Question.class);
	}
	
 public QuestionWrapperDto  populateQuestionWrapperFromDto(Page<Question> domainQuestions) {
		
	 DefaultMapperFactory mapperFactory=new DefaultMapperFactory.Builder().build();
		mapperFactory.classMap(Page.class, QuestionWrapperDto.class)
		.field("content", "questionDto")
		.field("size", "pageSize")
		.field("number", "offset")
		.byDefault().register();
		return mapperFactory.getMapperFacade().map(domainQuestions, QuestionWrapperDto.class);
				
		}
	

}
