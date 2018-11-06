package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.Problem;

public interface ProblemRepository extends CrudRepository<Problem, String> {

}
