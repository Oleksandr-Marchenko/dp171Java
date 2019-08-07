package com.softserve.elementaryTasks.validation;

public class NumberAsTextValidation implements ArgsValidator<String> {

    @Override
    public boolean validate(String argument) {

        return argument.matches("[-0-9]{1,12}+$");
    }
}
