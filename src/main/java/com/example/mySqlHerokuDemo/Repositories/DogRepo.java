package com.example.mySqlHerokuDemo.Repositories;

import com.example.mySqlHerokuDemo.Models.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepo extends CrudRepository<Dog, Long> {
}
