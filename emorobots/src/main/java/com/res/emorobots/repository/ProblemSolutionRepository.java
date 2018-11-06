package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.ProblemSolution;


public interface ProblemSolutionRepository extends CrudRepository<ProblemSolution, String> {

}
