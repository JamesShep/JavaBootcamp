package com.coderscampus.Week15.web;

import com.coderscampus.Week15.domain.Person;
import com.coderscampus.Week15.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WelcomeController {

    @Autowired
    private PersonService personService;

    @GetMapping("")
    public String getRootWebpage (ModelMap model) {
        // This is what gets returned / resolved when we return a string
        // inside a regular controller GetMapping method
        // src / main / resources / templates / {filename}.html

        Person person = new Person();

        model.put("person", person);

        /*String firstName = "James";
        String lastName = "S";
        model.put("firstName", firstName);
        model.put("lastName", lastName);*/
        return "welcome";
    }

    @PostMapping("")
    public String postRootWebpage (Person person) {
        Person savedPerson = personService.save(person);
        System.out.println(savedPerson);
        return "redirect:/";
    }
}
