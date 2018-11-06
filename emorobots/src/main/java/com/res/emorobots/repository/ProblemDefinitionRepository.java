package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.ProblemDefinition;


public interface ProblemDefinitionRepository extends CrudRepository<ProblemDefinition, String> {

}
