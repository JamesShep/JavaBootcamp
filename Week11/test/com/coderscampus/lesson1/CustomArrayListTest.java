package com.coderscampus.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    // Test-Driven Development Methodology
    // Step 1 - Write a failing test
    // Step 2 - Write the business logic to make the test pass
    // Step 3 - Refactor your code

    @Test
    void should_add_one_item_to_list() {
        // Three A's
        // Arrange, Act, Assert

        // Arrange
        CustomArrayList<Integer> customList = new CustomArrayList<>();

        // Act
        customList.add(10);
        Integer expectedResult = customList.get(0);
        Integer expectedSize = customList.getSize();

        // Assert
        // What would we expect to happen?
        // I expect there to be an Integer with value 10 stored in the first
        // index in my customList

        assertEquals(10, expectedResult);
        assertEquals(1, expectedSize);
    }

}