package com.coderscampus.week13.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//@Service
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FileService {
    private String fileName;

    public FileService() {
    }

    public FileService (String fileName) {
        this.fileName = fileName;
    }

    public List<String> readFile () throws IOException {
        return Files.readAllLines(Paths.get(fileName));
    }

}
