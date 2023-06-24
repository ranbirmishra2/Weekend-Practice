package com.hello.application.repository;

import com.hello.application.model.Hello;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends CrudRepository<Hello, Long> {
    // Define custom repository methods here
}
