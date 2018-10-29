package com.sparknetwork.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
/**
 * Model for Answers
 */
@Getter
@Setter
@Entity
public class Answers {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    Integer questionid;
		String answer;
		String username;
		
}
