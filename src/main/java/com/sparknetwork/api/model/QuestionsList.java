package com.sparknetwork.api.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * Model for QuestionsList
 */

@Getter
@Setter
@Component
public class QuestionsList {
	
	private Integer id;
	private String question;
	private String categoryid;
	private String questiontype;
	private String options;
	

}
