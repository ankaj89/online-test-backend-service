package info.ank.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import info.ank.domain.Question;
import info.ank.domain.Sets;
import info.ank.domain.Subject;
import info.ank.domain.SubjectSets;
import info.ank.exception.OnlineTestException;
import info.ank.model.QuestionDto;
import info.ank.service.AdminService;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping(value = "/admin")
public class AdminController {
	
	@Autowired
	public AdminService adminService;

	@PostMapping(value = "/saveQuestion")
	public String saveQuestion(@RequestBody Question question) {
		
		adminService.saveQuestion(question);
		return "Saved Sucessfully";
		
	}
	
	@PostMapping(value = "/saveSubject")
	public String saveSubject(@RequestBody Subject Subject) {
		
		adminService.saveSubject(Subject);
		return "Saved Sucessfully";
		
	}
	
	@PostMapping(value = "/saveSets")
	public String saveSets(@RequestBody Sets sets) {
		
		adminService.saveSets(sets);
		return "Saved Sucessfully";
		
	}
	
	@PutMapping(value = "/updateQuestion")
	public String updateQuestion(@RequestBody Question question) {
		
		adminService.updateQuestion(question);
		return "updated Sucessfully";
		
	}
	
	@PutMapping(value = "/updateSubject")
	public String updateSubject(@RequestBody Subject Subject) {
		
		adminService.updateSubject(Subject);
		return "Updated Sucessfully";
		
	}
	
	@PutMapping(value = "/updateSets")
	public String updateSets(@RequestBody Sets sets) {
		
		adminService.updateSets(sets);
		return "Updated Sucessfully";
		
	}
	
	@DeleteMapping(value = {"/deleteQuestion/{id}"})
	public String deleteQuestion(@PathVariable Integer id) throws OnlineTestException {
		
		try {
		 adminService.deleteQuestion(id);
		 return "Deleted Sucessfully";
		 }catch(Exception ex) {
			throw new OnlineTestException(4001,"Error occured while deleting Question record:- "+ex.getMessage()); 
		 }
				
	}
	
	@DeleteMapping(value = {"/deleteSubject/{id}"})
	public String deleteSubject(@PathVariable Integer id) throws OnlineTestException {
		try {
		 adminService.deleteSubject(id);
		  return "Deleted Sucessfully";	
		 }catch(Exception ex) {
			throw new OnlineTestException(4002,"Error occured while deleting Subject record:-  "+ex.getMessage()); 
		}
	}
	
	@DeleteMapping(value = {"/deleteSets/{id}"})
	public String deleteSets(@PathVariable Integer id) throws OnlineTestException {
	try {
		 adminService.deleteSets(id);
		 return "Deleted Sucessfully";
	 }catch(Exception ex) {
		throw new OnlineTestException(4003,"Error occured while deleting Sets record:- "+ex.getMessage()); 
	 }
		
	}
	
	@GetMapping(value = {"/getSubject","/getSubject/{id}"})
	public List<Subject> getSubject(@PathVariable(required = false) Integer id) {
		
		if(id !=null) {
			List<Subject> list = new ArrayList<Subject>();
			list.add(adminService.getSubjectById(id));
			return list;
		}
		return adminService.getAllSubject();
    }
	
	@GetMapping(value = { "/getSets","/getSets/{id}"})
	public List<Sets> getSets(@PathVariable(required = false) Integer id) {
		
		if(id !=null) {
			List<Sets> list = new ArrayList<Sets>();
			list.add(adminService.getSetsById(id));
			return list;
		}
		return adminService.getAllSets();
	}
	
	@GetMapping(value = { "/getSetsBySubjectId/{id}"})
	public List<SubjectSets> getSetsBySubject(@PathVariable(required = true) Integer id) {
		
		  return adminService.getSetsBySubject(id);
		//return subjectAndSets.stream().map(s->s.getSet()).collect(Collectors.toList());
		 
	}
			
	@GetMapping(value = "/getQuestionBySubjectAndSetsId")
	public List<QuestionDto> getQuestionBySubjectAndSetsId (@RequestParam("subjectId")Integer topicId,@RequestParam("setsId") Integer setsId) {

		return adminService.getQuestionsBySubjectAndSetId(topicId, setsId);
		
	}
	
	@GetMapping(value = "/getQuestionBySubjectSetsAndQuesId")
	public List<QuestionDto> getQuestionBySubjectIdSetsIdAndQuestionId (@RequestParam("subjectId")Integer topicId,@RequestParam("setsId") Integer setsId,@RequestParam("questionId") Integer questionId) {

		return adminService.getQuestionsBySubjectIdSetIdAndQuestionId(topicId, setsId,questionId);
		
	}
	
		
}
