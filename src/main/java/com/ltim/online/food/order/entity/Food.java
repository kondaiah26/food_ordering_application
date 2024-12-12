package com.ltim.online.food.order.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String description;
	
	private Long price;
	
	@ManyToOne
	private Category category;
	
	@Column(length = 1000)
	@ElementCollection
	private List<String> images;
	
	private boolean available;
	
	@ManyToOne
	private Restaurant restaurant;
	
	private boolean isVeg;
	
	private boolean isSeasonal;
	
	@ManyToMany
	private List<IngradientItem> ingradients= new ArrayList<>();
	
	@CreationTimestamp
	private LocalDate createdAt;
	
	
	
	
	

}
