package com.coderscampus.Week14;

import com.coderscampus.Week14.dto.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class JsonExample {

    /**
     *
     * JSON
     * Javascript Object Notation
     * A simple String based way to notate data
     * - Key Value Pairs
     * - Key : Value pairs are separated by commas
     * - Objects are represented by { }
     * Arrays are represented by [ ]
     *
     * Important Note:  JSON is NOT tied to JavcScript... it is
     * language agnostic (It will work in any language)
     *
     * Person : name, age, gender
     *
     * {
     *  "name" : "James S",
     *  "age" : 28,
     *  "gender" : "male"
     *  }
     *
     *  List<Person> people
     *  [
         *  {
         *      "name" : "James S",
         *      *  "age" : 28,
         *      *  "gender" : "male"
         *  },
         *  {
         *      "name" : "Jane Doe",
         *      *  "age" : 22,
         *      *  "gender" : "female"
         *  }
     *  ]
    */

    @Test
    public void convertJsonStringToJavaObject () {
        String jsonString = "{\"name\" : \"James S\", \"age\" : 28,\n" +
                "        \"gender\" : \"male\"}";

        ObjectMapper mapper = new ObjectMapper();
        try {
           Person person = mapper.readValue(jsonString, Person.class);
            System.out.println("JSON output as object:");
            System.out.println(person);
            celebrateBirthday(person);

            System.out.println("JSON output as String:");
            System.out.println(mapper.writeValueAsString(person));

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    private void celebrateBirthday(Person person) {
        person.setAge(person.getAge()+1);
    }
}
