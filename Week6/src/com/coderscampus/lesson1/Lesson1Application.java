package com.coderscampus.lesson1;

public class Lesson1Application {

    public static void main(String[] args) {
        Teacher physicsTeacher = new PhysicsTeacher();

        //PhysicsTeacher castedPhysicsTeacher = (PhysicsTeacher)physicsTeacher;

        System.out.println(physicsTeacher.getClasses());
        System.out.println(physicsTeacher.getLevelOfEduction());
        // Casting
        // ((PhysicsTeacher)physicsTeacher).teach("James Sheppard");
        //castedPhysicsTeacher.teach("James Sheppard");

        ((PhysicsTeacher)physicsTeacher).teach("James Sheppard"); // Single line cast

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
