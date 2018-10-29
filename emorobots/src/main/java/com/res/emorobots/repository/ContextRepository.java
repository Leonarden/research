package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.Context;

public interface ContextRepository extends CrudRepository<Context, String> {

}
