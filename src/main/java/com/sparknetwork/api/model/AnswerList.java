package com.sparknetwork.api.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
/**
 * Model for AnswerList
 */
@Getter
@Setter
@Component
public class AnswerList {
	 private Integer id;
	 private String questionid;
	 private String answer;
	 private String username;

}
