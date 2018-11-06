package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.Weight;


public interface WeightRepository extends CrudRepository<Weight, String> {

}
