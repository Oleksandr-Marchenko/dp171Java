package com.softserve.elementaryTasks.validation;

import java.util.List;

public class ChessValidation implements ListValidator<Integer> {

    @Override
    public boolean validate(List<Integer> arguments) {
        return arguments.get(0) <= 0 || arguments.get(1) <= 0;
    }

    @Override
    public boolean isCorrectSize(List arguments) {
        return false;
    }
}
