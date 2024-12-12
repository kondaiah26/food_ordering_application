package com.ltim.online.food.order.entity;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ltim.online.food.order.dto.RestaurantDto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	private String fullName;
	
	private String email;
	
	private String password;
	
	private USER_ROLE role;
	
	//we are using this jsonignore annotation to avoid the order list when we are fetching user details
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "customer")
	private List<Order> orders = new ArrayList<>();
	
	@ElementCollection
	private List<RestaurantDto> favourites = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> address= new ArrayList<>();
	
}
