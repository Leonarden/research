package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.Sentence2Sentence;


public interface Sentence2SentenceRepository extends CrudRepository<Sentence2Sentence, String> {

}
