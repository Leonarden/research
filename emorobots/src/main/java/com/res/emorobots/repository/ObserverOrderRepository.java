package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.ObserverOrder;


public interface ObserverOrderRepository extends CrudRepository<ObserverOrder, String> {

}
