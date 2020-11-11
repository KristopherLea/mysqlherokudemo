package com.example.mySqlHerokuDemo.Controllers;

import com.example.mySqlHerokuDemo.Models.Dog;
import com.example.mySqlHerokuDemo.Services.DogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DogController {

    @Autowired
    DogServiceImpl dogServiceImpl;

     @GetMapping("/dog")
     public Iterable<Dog> getAllDogs(){
         return dogServiceImpl.getAllDogs();
     }

     @PostMapping("/create/dog")
    public String postDog(){
         Dog dog = dogServiceImpl.getDogFromDogApi();
         dogServiceImpl.postDogFromDogApi(dog);
         return "fetched & created";
     }

}
