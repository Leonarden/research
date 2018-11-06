package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.OrderType;


public interface OrderTypeRepository extends CrudRepository<OrderType, String> {

}
