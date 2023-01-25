package info.ank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import info.ank.domain.Sets;

@Repository
public interface SetsRepository extends JpaRepository<Sets, Integer>{

    public Sets findBySetId(Integer topicId);
	
	public Sets findByName(String topicName);
	  
	public List<Sets> findAll();
}
