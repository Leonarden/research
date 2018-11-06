package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.Threshold;


public interface ThresholdRepository extends CrudRepository<Threshold, String> {

}
