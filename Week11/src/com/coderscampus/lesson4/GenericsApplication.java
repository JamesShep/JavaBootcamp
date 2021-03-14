package com.coderscampus.lesson4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericsApplication {

    @Test
    public void generics_examples () {
        List list = new ArrayList();

            list.add("First string value");
            list.add("Second string value");
            list.add('E');

            for (int i=0; i<list.size(); i++) {
                System.out.println((String)list.get(i));
        }

    }

    @Test
    public void more_generics_examples () {
        MyPair<Integer, String> myPair = new MyPair<>(1, "one");
        myPair.getKey();
        myPair.getValue();
    }

    @Test
    public void specifying_generic_types_at_method_level() {

        String val = Transformer.join(1, 2.0);
        System.out.println(val);
    }

    @Test
    public void wildcard_in_generics () {
        List<Number> list = new ArrayList<>();
        list.add(1L);
        list.add(5l);
        list.add(100L);
        String val = Transformer.join(list );
        System.out.println(val);
    }
}
