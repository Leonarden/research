package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.Solution;


public interface SolutionRepository extends CrudRepository<Solution, String> {

}
