package com.coderscampus.lesson1;

public class Teacher {
    private String classes;
    private String levelOfEduction;

    protected int totalNumberOfMarkedPapers;

    // Can only be accessed to someone who can 'mark papers' (teachers)
    protected void markPapers () {
        System.out.println("I am a teacher, and I'm now marking papers.");
    }

    private void getARaise () {
        System.out.println("Teacher gets a raise!");
    }

    public void teach () {
        System.out.println("I'm a teacher and I'm now teaching");
    }

    /*public void teach(String teacherName) {
        System.out.println("I'm a teacher called " + teacherName + " and I'm now teaching physics");
    }*/


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
