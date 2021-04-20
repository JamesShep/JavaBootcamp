package com.coderscampus.Week14.web;

import com.coderscampus.Week14.dto.Person;
import com.coderscampus.Week14.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/persons")
    public Person createPerson (@RequestParam String name, String gender, Integer age, Long id) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setId(id);
        personRepository.save(person);
        return person;
    }

    // fetches the person with ID 1
    // http://localhost:8080/persons/1
    @GetMapping("/persons/{personId}")
    public Person getPerson (@PathVariable Long personId) {
        System.out.println("Person ID is: " + personId);
        return personRepository.findById(personId);

    }
}
