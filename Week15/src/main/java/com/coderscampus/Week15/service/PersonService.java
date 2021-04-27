package com.coderscampus.Week15.service;

import com.coderscampus.Week15.domain.Person;
import com.coderscampus.Week15.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private Integer personId = 1;

    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person) {
        person.setId(personId++);
        return personRepository.save(person);
    }

}
