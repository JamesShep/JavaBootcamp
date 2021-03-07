package com.coderscampus.lesson1;

import java.math.BigDecimal;
import java.util.Optional;

public class OptionalApplication {

    public static void main(String[] args) {

        // Lesson 1
        Optional<String> fullName = Optional.of("James Sheppard");

        System.out.println(fullName);

        String james = fullName.get();

        System.out.println(james);

        // Lesson 2
        Recipe cookies = new Recipe();
        cookies.setName("Chocolate Chip Cookies");
        cookies.setInstructions("\n1: Pre-heat oven\n" +
                "2: Put dough on baking sheet\n" +
                "3: Cook dough for 15 minutes");
        cookies.setPriceOpt(new BigDecimal(9.99));

        System.out.println(cookies);

        BigDecimal price = cookies.getPriceOpt()
                .map(p -> p)
                .orElse(new BigDecimal(0));


/*        if (cookies.getPriceOpt().isPresent()) {
            BigDecimal price = cookies.getPriceOpt().get();
            System.out.println(price);
        }*/

        cookies.setPriceOpt(new BigDecimal(20.0));

        // Lesson 4

        cookies.getPriceOpt()
                .ifPresent(RecipeService::billClient);

        //.ifPresent(p -> RecipeService.billClient(p));
    }
}
