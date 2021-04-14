package com.coderscampus.week13.web;

import com.coderscampus.week13.service.FileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@RestController
public class FileController {

    @Autowired
    private ApplicationContext applicationContext;

    /*@Autowired
    private FileService fileService;*/

    @GetMapping("/customer-report")
    public Integer getCustomerData (Integer customerId) {
        Integer customerData = 0;
        // fetch data based on customerId
        customerData = getCustomerDataById(customerId);
        System.out.println("I think you're beautiful");
        return customerData;
    }

    private Integer getCustomerDataById(Integer customerId) {
        return new Random().nextInt();
    }

    @GetMapping("/read-lines")
    public List<String> readLines () throws IOException {
        FileService fileService = applicationContext.getBean(FileService.class);
        System.out.println(fileService);
        fileService = applicationContext.getBean(FileService.class);
        System.out.println(fileService);
        fileService = applicationContext.getBean(FileService.class);
        System.out.println(fileService);
        fileService = applicationContext.getBean(FileService.class);
        System.out.println(fileService);
        fileService = applicationContext.getBean(FileService.class);
        System.out.println(fileService);
        return fileService.readFile("test.txt");
    }

    @GetMapping("/hello-world")
    public String helloWorld () {
        return  "Hello World!";
    }

    @PostMapping("/hello-world")
    public String helloWorldPost () {
        return "okay cool, you just posted some data!";
    }

}
