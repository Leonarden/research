package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.Subject;


public interface SubjectRepository extends CrudRepository<Subject, String> {

}
