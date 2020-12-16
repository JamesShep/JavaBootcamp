package com.coderscampus.lesson1;

import com.coderscampus.lesson1.compsci.CompSciTeacher;
import com.coderscampus.lesson1.phys.PhysicsTeacher;
import com.coderscampus.lesson1.qphy.QuantumPhysicsTeacher;
import com.coderscampus.lesson6.PackageAccessModifierExample;

public class Lesson1Application {

    /**Access modifiers in Java are public, protected, package, private
    public - method can be accessed anywhere
    private - method can only be accessed from that class
    protected - method can only be accessed from that classes hierarchy
    package - accessible to the package only
     */

    public static void main(String[] args) {
        Teacher physicsTeacher = new PhysicsTeacher();

        PackageAccessModifierExample example = new PackageAccessModifierExample();

        System.out.println(example.someValue);
        System.out.println("-------------");

        //PhysicsTeacher castedPhysicsTeacher = (PhysicsTeacher)physicsTeacher;

        System.out.println(physicsTeacher.getClasses());
        System.out.println(physicsTeacher.getLevelOfEduction());
        // Casting
        // ((PhysicsTeacher)physicsTeacher).teach("James Sheppard");
        //castedPhysicsTeacher.teach("James Sheppard");

        //((PhysicsTeacher)physicsTeacher).teach("James Sheppard"); // Single line cast
        ((PhysicsTeacher)physicsTeacher).markPapers();
                // Physics teacher is part of teacher. So should have access to protected classes

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
