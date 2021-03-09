package com.coderscampus.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    // Test-driven Development Methodology
    // Step 1 - Write a failing test
    // Step 2 - Write the business logic to make the test pass (code itself)
    // Step 3 - Refactor your code
    // -- Repeat

    @Test
    void should_add_one_item_to_list () {
        // Three A's
        // Arrange
        // Act
        // Assert

        // ARRANGE
        CustomList<Integer> sut = new CustomArrayList<>();

        // ACT
        sut.add(10);
        Integer expectedResult = sut.get(0);
        Integer expectedSize = sut.getSize();

        // ASSERT
        // What would we expect to happen?
        // I expect there to be an integer with value 10 stored in the first
        // index in my custom list

        assertEquals(10, expectedResult);
        assertEquals(1, expectedSize);
    }

    @Test
    void should_add_eleven_items_to_list () {
        // Three A's
        // Arrange
        // Act
        // Assert

        // ARRANGE
        // sut == System under test
        CustomList<Integer> sut = new CustomArrayList<>();

        // ACT
        for (int i = 1; i <= 11; i++ ) {
            sut.add(i);
        }

        // ASSERT

        for (int i = 0; i < 11; i++) {
            assertEquals(i + 1, sut.get(i));
        }
        assertEquals(11, sut.getSize());
    }

    @Test
    void should_add_twentyone_items_to_list () {
        // Three A's
        // Arrange
        // Act
        // Assert

        // ARRANGE
        // sut == System under test
        CustomList<Integer> sut = new CustomArrayList<>();

        // ACT
        for (int i = 1; i <= 21; i++ ) {
            sut.add(i);
        }

        // ASSERT

        for (int i = 0; i < 21; i++) {
            assertEquals(i + 1, sut.get(i));
        }
        assertEquals(21, sut.getSize());
    }
}