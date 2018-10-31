package com.res.emorobots.repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.res.emorobots.jpa.entity.Sentence;

public interface SentenceRepository extends CrudRepository<Sentence, String> {

	@Query("SELECT COUNT(w) FROM Sentence w WHERE w.text=:text")
    Long countByName(@Param("text") String text);
	

}
