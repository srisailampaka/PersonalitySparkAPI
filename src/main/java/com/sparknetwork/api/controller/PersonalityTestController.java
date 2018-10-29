package com.sparknetwork.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sparknetwork.api.model.AnswerPojo;
import com.sparknetwork.api.model.QuestionsList;
import com.sparknetwork.api.model.QuestionsPojo;
import com.sparknetwork.api.service.PersonalityTestService;
/**
 * Controller for get the question list and submit the answers
 */
@RestController
public class PersonalityTestController {
	
	@Autowired
	private PersonalityTestService service;
	
	@Autowired
	private QuestionsPojo questions;
	
	@Autowired
	private QuestionsList questionsList;
	

	/**
	 * This method for get the Questions list details 
	 * 
	 * @throws Exception
	 */
	@RequestMapping(value = "/questions", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<QuestionsPojo> getPersonalityQuestions() throws Exception {
		
		QuestionsPojo finalPojo= service.getQuestions();
        
		return ResponseEntity.accepted().body(finalPojo);
		
		
		 
	}
	
	
	/**
	 * This method for  post the answers details 
	 * 
	 * @throws Exception
	 */
	@RequestMapping(value = "/answers", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> submitTheAnswers(@RequestBody AnswerPojo answers) throws Exception {
		service.submitAnswers(answers);
        return ResponseEntity.accepted().body("{\"status\":\"sucess\",\"message\":\"DataSaved Successfully\"}");
		 
	}

}
