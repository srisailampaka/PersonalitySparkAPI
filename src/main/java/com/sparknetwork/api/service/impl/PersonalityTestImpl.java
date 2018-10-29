package com.sparknetwork.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sparknetwork.api.model.AnswerPojo;
import com.sparknetwork.api.model.Answers;
import com.sparknetwork.api.model.Category;
import com.sparknetwork.api.model.CategoryList;
import com.sparknetwork.api.model.Questions;
import com.sparknetwork.api.model.QuestionsList;
import com.sparknetwork.api.model.QuestionsPojo;
import com.sparknetwork.api.repository.AnswersRepository;
import com.sparknetwork.api.repository.CategoryRepository;
import com.sparknetwork.api.repository.QuestionsRepository;
import com.sparknetwork.api.service.PersonalityTestService;
/**
 * Implementation for personality test details
 */
@Service
public class PersonalityTestImpl implements PersonalityTestService{
	@Autowired
	QuestionsRepository questionsRepository;

	@Autowired
	AnswersRepository answersRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	private QuestionsPojo finalQuestions;
	
	
	@Override
	public QuestionsPojo  getQuestions() {
		Iterable<Category> categories=categoryRepository.findAll();
		Iterable<Questions> questions=questionsRepository.findAll();
		
        List<QuestionsList> questionPojo =new ArrayList<QuestionsList>();
        
        questions.forEach(item->{
        	QuestionsList questionsList = new QuestionsList();
        	questionsList.setId(item.getId());
		questionsList.setCategoryid(item.getCategoryid());
		questionsList.setQuestiontype(item.getQuestiontype());
		questionsList.setQuestion(item.getQuestion());
		questionsList.setOptions(item.getOptions());
		questionPojo.add(questionsList);
		});
        
        List<CategoryList> categoryPojo =new ArrayList<CategoryList>();
        
        categories.forEach(item->{
        	CategoryList categoryList = new CategoryList();
        	categoryList.setId(item.getId());
        categoryList.setName(item.getName());
        categoryPojo.add(categoryList);
		});
		
        finalQuestions.setQuestionsList(questionPojo);
        finalQuestions.setCategory(categoryPojo);
	
		return finalQuestions;
	}

	@Override
	public void submitAnswers(AnswerPojo answers) {
		
		List<Answers> answeEntityList =new ArrayList<Answers>();
		answers.getAnswerList().forEach(item->{
			Answers answerEntity = new Answers();
			answerEntity.setQuestionid(Integer.valueOf(item.getQuestionid()));
			answerEntity.setAnswer(item.getAnswer());
			answerEntity.setUsername(item.getUsername());
			answeEntityList.add(answerEntity);
		
		});
		answersRepository.saveAll(answeEntityList);
	}

}
