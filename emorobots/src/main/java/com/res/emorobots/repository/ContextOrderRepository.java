package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.ContextOrder;


public interface ContextOrderRepository extends CrudRepository<ContextOrder, String> {

}
