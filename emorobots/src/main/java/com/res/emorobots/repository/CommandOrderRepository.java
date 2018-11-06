package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.CommandOrder;


public interface CommandOrderRepository extends CrudRepository<CommandOrder, String> {

}
