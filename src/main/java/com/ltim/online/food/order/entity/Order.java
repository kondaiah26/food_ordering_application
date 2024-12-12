package com.ltim.online.food.order.entity;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	@ManyToMany
	private List<User> customer;
	
	@JsonIgnore
	@ManyToOne
	private Restaurant restaurant;
	
	private Long totalAmount;
	
	private String orderStatus;
	
	@CreationTimestamp
	private LocalDate createdAt;
	
	@ManyToOne
	private Address deliveryAddress;
	
	@OneToMany
	private List<OrderItem> items;
	
	
//	private Payment payment;
	
	private int totlaItems;
	
	private int totalPrice;
	
	
	
	

}
