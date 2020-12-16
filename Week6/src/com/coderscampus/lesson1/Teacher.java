package com.coderscampus.lesson1;

public class Teacher {
    private String classes;
    private String levelOfEduction;

    public Teacher () {
        System.out.println("Inside the Teacher constructor");
        this.classes = "No classes assigned";
        this.levelOfEduction = "No education assigned";
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getLevelOfEduction() {
        return levelOfEduction;
    }

    public void setLevelOfEduction(String levelOfEduction) {
        this.levelOfEduction = levelOfEduction;
    }
}
