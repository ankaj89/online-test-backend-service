package info.ank.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.ank.domain.Answer;
import info.ank.domain.Question;
import info.ank.domain.Sets;
import info.ank.domain.Subject;
import info.ank.domain.SubjectSets;
import info.ank.mapper.AdminQuestionMapper;
import info.ank.model.QuestionDto;
import info.ank.repository.QuestionRepository;
import info.ank.repository.SetsRepository;
import info.ank.repository.SubjectAndSetRepository;
import info.ank.repository.SubjectRepository;

@Service
public class AdminService {
	
	@Autowired
	public QuestionRepository questionRepository;
	
	@Autowired
	public SubjectRepository subjectRepository;
	
	@Autowired
	public SetsRepository setsRepository;
	
	@Autowired
	public SubjectAndSetRepository subjectAndSetRepository;
	
	@Autowired
	public AdminQuestionMapper adminMapper;
	   	
    public List<QuestionDto> getQuestionsBySubjectAndSetId(Integer subjectId,Integer setsId) {
		
    	 List<Question> dmoainQuestion= questionRepository.findBySubjectSet_Subject_SubjectIdAndSubjectSet_set_setId(subjectId,setsId);
    	 return adminMapper.mapperQuestionDomainToDtoAsList(dmoainQuestion);

    }
    
   public List<QuestionDto> getQuestionsBySubjectIdSetIdAndQuestionId(Integer subjectId,Integer setsId,Integer questionId) {
		
	   List<Question> dmoainQuestion=questionRepository.getQuestionsBySubjectIdSetIdAndQuestionId(subjectId,setsId,questionId);
	   return adminMapper.mapperQuestionDomainToDtoAsList(dmoainQuestion);

   }
    
   public List<SubjectSets> getSetsBySubjectId(Integer subjectId) {
		
		return subjectAndSetRepository.findBySubjectSubjectId(subjectId);
	}
    
    public Subject getSubjectById(Integer id) {
    	
    	return subjectRepository.findBySubjectId(id);
    }
    
    public Subject getSubjectByName(String name) {
    	
    	return subjectRepository.findByName(name);
    }
    
    public List<Subject> getAllSubject() {
       	
       	return subjectRepository.findAll();
       }
    
   public Sets getSetsById(Integer id) {
    	
    	return setsRepository.findBySetId(id);
    }
   
     public List<SubjectSets> getSetsBySubject(Integer id) {
    	
    	return subjectAndSetRepository.findBySubjectSubjectId(id);
    }
   
    public Sets getSetsByName(String name) {
    	
    	return setsRepository.findByName(name);
    }
    
    public List<Sets> getAllSets() {
       	
       	return setsRepository.findAll();
       }
    
   public void saveQuestion(Question question) {
	   Date sqlDate= new Date(System.currentTimeMillis());
	   // question.setQuestionId(20);
	   question.setCreatedDate(sqlDate);
	   int id=100;
	   for(int i=0;i<question.getOptions().size();i++) {
		
		   question.getOptions().get(i).setCreatedDate(sqlDate);
		 //  question.getOptions().get(i).setOptionId(id);
		   id++;
		   
		   if(question.getOptions().get(i).getName().equalsIgnoreCase(question.getAnswer().getOption().getName())) {
			   question.getAnswer().setOption(question.getOptions().get(i));
		   }
	   }
	   question.getAnswer().setQuestion(question);
	   //question.getAnswer().setAnswerId(222);
	   question.getAnswer().setCreatedDate(sqlDate);
	   
	
	   
	   //question.getOptions().stream().forEach((option)->{option.setCreatedDate(sqlDate);});
	   questionRepository.save(question);
    	
    }
    
    public void saveSubject(Subject subject) {
    	 Date sqlDate= new Date(System.currentTimeMillis());
    	 subject.setCreatedDate(sqlDate);
    	subjectRepository.save(subject);
    	
    }
    public void saveSets(Sets sets) {
    	Date sqlDate= new Date(System.currentTimeMillis());
    	sets.setCreatedDate(sqlDate);
    	setsRepository.save(sets);
    	
    }
    
    public void updateQuestion(Question question) {
 	   Date sqlDate= new Date(System.currentTimeMillis());
 	   question.setUpdatedDate(sqlDate);
 	   question.getAnswer().setUpdatedDate(sqlDate);
	   question.getOptions().stream().forEach((option)->{option.setUpdatedDate(sqlDate);});
 	   questionRepository.save(question);
     	
     }
    
   public void updateSubject(Subject subject) {
	   Date sqlDate= new Date(System.currentTimeMillis());
	   subject.setUpdatedDate(sqlDate);
	   subjectRepository.save(subject);
    }
    public void updateSets(Sets sets) {
    	Date sqlDate= new Date(System.currentTimeMillis());
    	sets.setUpdatedDate(sqlDate);
    	setsRepository.save(sets);
    	
    }
    
    public void deleteQuestion(Integer id) {
    	questionRepository.deleteById(id);
     	
     }
    
   public void deleteSubject(Integer id) {
	   subjectRepository.deleteById(id);
    	
    }
    public void deleteSets(Integer id) {
    	
    	setsRepository.deleteById(id);
    }
        
    
}
