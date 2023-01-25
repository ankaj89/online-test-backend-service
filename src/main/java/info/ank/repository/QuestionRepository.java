package info.ank.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import info.ank.domain.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>{

	@Query("SELECT q FROM Question q WHERE q.questionId = :quesId" )
	List<Question> getQuestionByQuestionId(@Param("quesId") Integer quesId);
	
	List<Question> findBySubjectSet_Subject_SubjectIdAndSubjectSet_set_setId(Integer SubjectId,Integer setId);
	
	@Query("select q from Question q where q.subjectSet.subject.subjectId=:subjectId and q.subjectSet.set.setId=:setId and q.questionId=:questionId")
	List<Question> getQuestionsBySubjectIdSetIdAndQuestionId(Integer subjectId,Integer setId,Integer questionId);
		
	List<Question> findBySubjectSet_Subject_nameAndSubjectSet_set_name(String SubjectName,String setsName,Pageable pageable);
	
	Page<Question> findBySubjectSet_Subject_SubjectIdAndSubjectSet_set_setId(Integer subjectId,Integer setId,Pageable pageable);


 
}
