package com.coderscampus.lesson1;

public class Lesson1Application {

    public static void main(String[] args) {
        PhysicsTeacher physicsTeacher = new PhysicsTeacher();

        System.out.println(physicsTeacher.getClasses());
        System.out.println(physicsTeacher.getLevelOfEduction());

        CompSciTeacher compSciTeacher = new CompSciTeacher();

        System.out.println(compSciTeacher.getClasses());
        System.out.println(compSciTeacher.getLevelOfEduction());
    }

}
