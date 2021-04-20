package com.coderscampus.Week14.web;

import com.coderscampus.Week14.dto.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @PostMapping("/persons")
    public Person createPerson (@RequestParam String name, String gender, Integer age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        return person;
    }

    // fetches the person with ID 1
    // http://localhost:8080/persons/1
    @GetMapping("/persons/{personID}")
    public Person getPerson (@PathVariable Long personId) {
        System.out.println("Person ID is: " + personId);
        return null;

    }
}
