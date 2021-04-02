package com.coderscampus.week13.web;

import com.coderscampus.week13.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping("/read-lines")
    public List<String> readLines () throws IOException {
        fileService = new FileService();
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
