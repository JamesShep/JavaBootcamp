package com.coderscampus.lesson6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationApplication {

    public static void main(String[] args) {

        AnnotationApplicationTest testClass = new AnnotationApplicationTest();

        Method[] methods = AnnotationApplicationTest.class.getMethods();

        int testPass = 0;
        int testFailed = 0;
        int testIgnored =0;

        for (Method method : methods) {
            MyTest myTest = method.getAnnotation(MyTest.class);

            if (myTest != null) {
                try {
                    if (myTest.enabled()) {
                        method.invoke(testClass);
                        testPass++;
                    } else {
                        testIgnored++;

                    }
                } catch (Exception e) {
                    testFailed++;
                }
            }
        }

        System.out.println("Tests Passed: " + testPass + "\nTests Failed: " + testFailed + "\nTests Ignored: " + testIgnored);
    }
}