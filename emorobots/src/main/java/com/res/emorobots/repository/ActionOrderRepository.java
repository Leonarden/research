package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.ActionOrder;


public interface ActionOrderRepository extends CrudRepository<ActionOrder, String> {

}
