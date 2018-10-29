package com.sparknetwork.api.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
/**
 * Model for CategoryList
 */

@Getter
@Setter
@Component
public class CategoryList {
	
	private Integer id;
	private String name;

}
