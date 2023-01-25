package info.ank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import info.ank.domain.SubjectSets;

@Repository
public interface SubjectAndSetRepository extends JpaRepository<SubjectSets, Integer>{

	
	public List<SubjectSets> findBySubjectSubjectId(Integer subjectId);
	
	
}
