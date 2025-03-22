package com.learn_spring_batch.learn_spring_batch.repository;

import com.learn_spring_batch.learn_spring_batch.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
