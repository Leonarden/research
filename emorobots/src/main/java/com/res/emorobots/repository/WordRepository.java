package com.res.emorobots.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.res.emorobots.jpa.entity.Word;

public interface WordRepository extends CrudRepository<Word, String> {

	@Query("SELECT COUNT(w) FROM Word w WHERE w.text=:text")
    Long countByName(@Param("text") String text);
	

}
