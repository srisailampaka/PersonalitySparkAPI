package com.sparknetwork.api.service;

import com.sparknetwork.api.model.AnswerPojo;
import com.sparknetwork.api.model.QuestionsPojo;

/**
 * Interface for PersonalityTestService
 */
public interface PersonalityTestService {
	QuestionsPojo  getQuestions();
	void  submitAnswers(AnswerPojo answers); 
}
