package com.dexter.devops.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class Person implements Serializable {
	private static final long serialVersionUID = -6511157698822307938L;
	private String firstname;
	private String lastname;
	private int age;
}
