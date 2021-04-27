package com.coderscampus.Week15.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("")
    public String getRootWebpage (ModelMap model) {
        // This is what gets returned / resolved when we return a string
        // inside a regular controller GetMapping method
        // src / main / resources / templates / {filename}.html
        String firstName = "James";
        String lastName = "S";
        model.put("firstName", firstName);
        model.put("lastName", lastName);
        return "welcome";
    }
}
