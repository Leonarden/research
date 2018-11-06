package com.res.emorobots.repository;


import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.jpa.entity.OrderProblem;

public interface OrderProblemRepository extends CrudRepository<OrderProblem, String> {

}
