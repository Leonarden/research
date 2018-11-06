package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.Observer;


public interface ObserverRepository extends CrudRepository<Observer, String> {

}
