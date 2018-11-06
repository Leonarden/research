package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.Definition;


public interface DefinitionRepository extends CrudRepository<Definition, String> {

}
