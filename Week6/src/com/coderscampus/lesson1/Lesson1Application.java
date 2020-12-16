package com.coderscampus.lesson1;

public class Lesson1Application {

    public static void main(String[] args) {
        PhysicsTeacher physicsTeacher = new PhysicsTeacher();

        System.out.println(physicsTeacher.getClasses());
        System.out.println(physicsTeacher.getLevelOfEduction());
        physicsTeacher.teach("James Sheppard");
        System.out.println("------");

        CompSciTeacher compSciTeacher = new CompSciTeacher();

        System.out.println(compSciTeacher.getClasses());
        System.out.println(compSciTeacher.getLevelOfEduction());
        compSciTeacher.teach();
        System.out.println("------");

        QuantumPhysicsTeacher quantumPhysicsTeacher = new QuantumPhysicsTeacher();

        System.out.println(quantumPhysicsTeacher.getClasses());
        System.out.println(quantumPhysicsTeacher.getLevelOfEduction());
        quantumPhysicsTeacher.teach();
        System.out.println("------");
    }

}
