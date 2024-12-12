package com.ltim.online.food.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltim.online.food.order.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
