package com.sparknetwork.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Model for Questions
 */

@Entity
@Getter
@Setter
public class Questions {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer id;
	String question;
	String categoryid;
	String questiontype;
	String options;
	
	
	

}
