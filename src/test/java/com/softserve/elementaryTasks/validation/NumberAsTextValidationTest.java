package com.softserve.elementaryTasks.validation;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberAsTextValidationTest {

    private NumberAsTextValidation validator;

    public NumberAsTextValidationTest() {
        this.validator = new NumberAsTextValidation();
    }

    private String string;

    @Test
    public void validateCorrectNumberTest() {
        string = "25";
        assertTrue(validator.validate(string));
    }

    @Test
    public void validateArgAsStringTest() {
        string = "dsds";
        assertFalse(validator.validate(string));
    }

    @Test
    public void validateCorrectNumberLengthTest() {
        string = "999999999999";
        assertTrue(validator.validate(string));
    }

    @Test
    public void validateInCorrectNumberLengthTest() {
        string = "9999999999999";
        assertFalse(validator.validate(string));
    }
}