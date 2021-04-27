package com.coderscampus.Week15.service;

import com.coderscampus.Week15.domain.Person;
import com.coderscampus.Week15.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private Integer personId = 1;

    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person) {
        if (person.getId() == null) {
            person.setId(personId++);
        }
        return personRepository.save(person);
    }

    public Person findById(Integer personId) {
        return personRepository.findById(personId);

    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public void delete(Integer personId) {
        personRepository.delete(personId);
    }
}
