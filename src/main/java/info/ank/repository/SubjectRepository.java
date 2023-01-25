package info.ank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import info.ank.domain.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{

	
	public Subject findBySubjectId(Integer subjectId);
	
	public Subject findByName(String SubjectName);
	  
	public List<Subject> findAll();
}
