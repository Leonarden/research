package com.res.emorobots.repository;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.WordSentence;


public interface WordSentenceRepository extends CrudRepository<WordSentence, String> {

}
