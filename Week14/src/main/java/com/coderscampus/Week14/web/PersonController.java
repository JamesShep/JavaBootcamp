package com.coderscampus.Week14.web;

import com.coderscampus.Week14.dto.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
