package info.ank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import info.ank.model.QuestionWrapperDto;
import info.ank.repository.QuestionPaginationRepository;
import info.ank.service.OnlineTestService;

@RestController
@RequestMapping(value = "/onlineTest")
public class OnlineTestController {
	
	@Autowired
	public OnlineTestService onlineTestService;
	
	@Autowired
	public QuestionPaginationRepository questionPaginationRepository;
	
	
	@GetMapping(value = "/getQuestionBySubjectAndSetsId")
	public QuestionWrapperDto getQuestionBySubjectIdAndSetsId (@RequestParam("topicId")Integer topicId,@RequestParam("setsId") Integer setsId,@RequestParam("offSet")Integer offSet,@RequestParam("pageSize") Integer pageSize) {

		QuestionWrapperDto tt= onlineTestService.getQuestionsBySubjectAndSetID(topicId, setsId,offSet,pageSize);
		return tt;
	}
	
	@PostMapping("/saveAnswer")
	public void saveAnswer() {
		
	} 

}
