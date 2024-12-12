package com.ltim.online.food.order.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
//@Entity
@Embeddable
public class ContactInformation {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String email;
	
	private String mobile;
	
	private String twitter;
	
	private String instagram;
	
	
}
