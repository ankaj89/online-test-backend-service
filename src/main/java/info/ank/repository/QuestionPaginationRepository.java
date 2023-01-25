package info.ank.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import info.ank.domain.Question;

@Repository
public interface QuestionPaginationRepository extends  JpaRepository<Question, Long> {

	 //List<Question> findAllQuestions(Pageable pageable) ;
	 Page<Question> findByQuestionId(Integer id,Pageable pageable);
	 
	 Page<Question> findBySubjectSet_Subject_SubjectIdAndSubjectSet_set_setId(int SubjectName,int setsName,Pageable pageable);

		
}
