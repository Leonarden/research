package com.res.emorobots.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.res.emorobots.jpa.entity.Synonym;

public interface SynonymRepository extends CrudRepository<Synonym, String> {

	@Query("SELECT COUNT(w) FROM Synonym w WHERE w.text=:text")
    Long countByName(@Param("text") String text);
	

}

