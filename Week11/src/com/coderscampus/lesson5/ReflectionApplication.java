package com.coderscampus.lesson5;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApplication {

    PersonRepository personRepo = new PersonRepository();
    CatRepository catRepo = new CatRepository();
    CarRepository carRepo = new CarRepository();

    @Test
    public void reflection_test () {
        Person person = new Person() ;
        Cat cat = new Cat() ;
        Car car = new Car() ;

        person.setName("Radha Turner");
        person.setAge(18);
        person.setEyeColour("Brown");

        Method[] methods = person.getClass().getMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }

        save(person, personRepo);
        save(cat, catRepo);
        save(car, carRepo);
    }

    public <T, R> void save (T obj, R repo) {
        Class<T> c = (Class<T>) obj.getClass();
        //String nameOfClass = c.getName();

        //String nameOfRepository = nameOfClass + " Repository";
        try {
            //Class<?> repositoryClass = Class.forName(nameOfRepository);
            Method saveMethod = repo.getClass().getMethod("save", c);
            saveMethod.invoke(repo, obj);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            System.err.println("Oops there was an error getting the save method");
        }
    }


    public void save (Person person) {
        // get a repository

        PersonRepository personRepository = new PersonRepository() ;
        personRepository.save(person);
    }

    public void save (Cat cat) {
        CatRepository catRepository = new CatRepository() ;
        catRepository.save(cat);
    }

    public void save (Car car) {
        CarRepository carRepository = new CarRepository() ;
        carRepository.save(car);
    }
}