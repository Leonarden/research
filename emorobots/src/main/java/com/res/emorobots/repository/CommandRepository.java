package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.Command;

public interface CommandRepository extends CrudRepository<Command, String> {

}
