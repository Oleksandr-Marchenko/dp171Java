package com.softserve.elementaryTasks.task03.model;

import com.softserve.elementaryTasks.MyString;
import com.softserve.elementaryTasks.validation.TriangleValidation;
import com.softserve.elementaryTasks.validation.ListValidator;

import java.util.ArrayList;
import java.util.List;

public class TriangleFactory {

    public static Triangle createTriangle(List<String> arg) {

        ListValidator<Double> validator = new TriangleValidation();
        List<Double> sides = new ArrayList<>();
        for (int i = 1; i < arg.size(); i++) {
            sides.add(Double.parseDouble(arg.get(i)));
        }

        if (!((TriangleValidation) validator).isCorrectSize(arg) ||
                !((TriangleValidation) validator).validateName(arg.get(0)) ||
                !(validator.validate(sides))) {
            System.out.println(MyString.INPUT_WRONG_SIDES_TASK_03);

            return null;
        }

        System.out.println("new triangle");
        return new Triangle(arg.get(0),
                Double.parseDouble(arg.get(1)),
                Double.parseDouble(arg.get(2)),
                Double.parseDouble(arg.get(3)));
    }
}
