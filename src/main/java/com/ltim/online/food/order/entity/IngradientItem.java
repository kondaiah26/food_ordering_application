package com.ltim.online.food.order.entity;

import java.util.List;
import java.util.Locale.Category;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class IngradientItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

}
