package com.sparknetwork.api.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Model for Personality
 */

@Getter
@Setter
public class Personality {
private static final long serialVersionUID = 1L;
 List<String> categories;
 Questions questions;

}
