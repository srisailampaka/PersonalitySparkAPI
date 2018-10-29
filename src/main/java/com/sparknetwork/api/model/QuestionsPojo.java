package com.sparknetwork.api.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class QuestionsPojo {

	private List<QuestionsList> questionsList;
	private List<CategoryList> category;
	

}
