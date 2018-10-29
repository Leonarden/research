package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.Action;

public interface ActionRepository extends CrudRepository<Action, Long> {

}
