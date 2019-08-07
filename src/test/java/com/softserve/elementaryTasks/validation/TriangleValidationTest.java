package com.softserve.elementaryTasks.validation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TriangleValidationTest {

    private TriangleValidation validator;

    public TriangleValidationTest() {
        this.validator = new TriangleValidation();
    }

    private List<Double> sides = new ArrayList<>();

    @Test
    public void validatePositiveNumberTest() {
        sides.add(30.0);
        sides.add(30.0);
        sides.add(30.0);

        assertTrue(validator.validate(sides));
    }

    @Test
    public void validateNegativeNumberTest() {
        sides.add(30.0);
        sides.add(-30.0);
        sides.add(30.0);

        assertFalse(validator.validate(sides));
    }

    @Test
    public void validateIncorrectSidesTest() {
        sides.add(2.0);
        sides.add(1.0);
        sides.add(30.0);

        assertFalse(validator.validate(sides));
    }

    @Test
    public void validateCorrectSizeTest() {
        List<String> strings = new ArrayList<>();
        strings.add("dsdsd");
        strings.add("2");
        strings.add("5");
        strings.add("5");
        assertTrue(validator.isCorrectSize(strings));
    }

    @Test
    public void validateIncorrectSizeTest() {
        List<String> strings = new ArrayList<>();
        strings.add("dsds");
        strings.add("2");
        strings.add("5");
        assertFalse(validator.isCorrectSize(strings));
    }

    @Test
    public void validateCorrectNameTest() {
        String string = "Triangle_434";
        assertTrue(validator.validateName(string));
    }

    @Test
    public void validateIncorrectNameTest() {
        String string = "Triangle1*/";
        assertFalse(validator.validateName(string));
    }

    @Test
    public void validateNullNameTest() {
        assertFalse(validator.validateName(null));
    }
}