package com.softserve.elementaryTasks.validation;

import java.util.List;

public class TriangleValidation implements ListValidator<Double> {

    @Override
    public boolean validate(List<Double> sides) {

        return isNumber(sides) && isTriangle(sides);
    }

    private boolean isNumber(List<Double> arg) {

        return arg.get(0) > 0 && arg.get(1) > 0 && arg.get(2) > 0;
    }

    private boolean isTriangle(List<Double> sides) {

        return ((sides.get(0) + sides.get(1) > sides.get(2))) &&
                ((sides.get(0) + sides.get(2) > sides.get(1))) &&
                ((sides.get(1) + sides.get(2) > sides.get(0)));
    }

    @Override
    public boolean isCorrectSize(List arg) {

        return arg.size() == 4;
    }

    public boolean validateName(String arg) {

        return arg != null && !arg.isEmpty() && arg.matches("[a-zA-Z0-9_.]+$");
    }
}
