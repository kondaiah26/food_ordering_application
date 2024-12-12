package com.ltim.online.food.order.dto;

import java.util.List;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class RestaurantDto {
	
	private String title;
	
	private List<String> images;
	
	private String description;
	
	private Long id;
	

}
