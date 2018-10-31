package com.res.emorobots.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.res.emorobots.jpa.entity.Symbol;

public interface SymbolRepository extends CrudRepository<Symbol, String> {

	@Query("SELECT COUNT(w) FROM Symbol w WHERE w.text=:text")
    Long countByName(@Param("text") String text);
	

}
