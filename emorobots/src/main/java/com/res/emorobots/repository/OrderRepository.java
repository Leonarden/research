package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.Order;

public interface OrderRepository extends CrudRepository<Order, String> {

}
