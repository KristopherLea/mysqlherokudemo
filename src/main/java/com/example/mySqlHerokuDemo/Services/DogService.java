package com.example.mySqlHerokuDemo.Services;

import com.example.mySqlHerokuDemo.Models.Dog;

public interface DogService {
    public Dog getDogFromDogApi();
    public void postDogFromDogApi(Dog dog);
    public Iterable<Dog> getAllDogs();
}
