package info.ank.mapper;

import java.util.List;

import org.springframework.stereotype.Service;

import info.ank.domain.Question;
import info.ank.model.QuestionDto;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@Service
public class AdminQuestionMapper {
	
	
	public List<QuestionDto>  mapperQuestionDomainToDtoAsList(List<Question> question) {
		
		DefaultMapperFactory mapperFactory=new DefaultMapperFactory.Builder().build();
		mapperFactory.classMap(Question.class, QuestionDto.class).byDefault().register();
	
	    return mapperFactory.getMapperFacade().mapAsList(question, QuestionDto.class);
	}
	
    public List<Question>  mapperQuestionDtoToDomain(List<QuestionDto> questionDto) {
		
		DefaultMapperFactory mapperFactory=new DefaultMapperFactory.Builder().build();
		mapperFactory.classMap(QuestionDto.class, Question.class).byDefault().register();
	
	    return mapperFactory.getMapperFacade().mapAsList(questionDto, Question.class);
	}
	
	

}
