package com.softserve.elementaryTasks.task05;

import com.softserve.elementaryTasks.MyString;
import com.softserve.elementaryTasks.input.InputNumberAsTextConsole;
import com.softserve.elementaryTasks.input.InputStringArgument;
import com.softserve.elementaryTasks.validation.ArgsValidator;
import com.softserve.elementaryTasks.validation.NumberAsTextValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(MyString.TASK_05_DESCRIPTION);
        InputStringArgument inputString = new InputNumberAsTextConsole();
        ArgsValidator<String> validator = new NumberAsTextValidation();

        String string;

        if (args.length == 1) {

            if (validator.validate(args[0])) {
                System.out.println(MyString.TASK_05_ARG + " " + args[0]);
                System.out.println(NumberAsText.numberAsText(Long.parseLong(args[0])));
            }
        } else {
            do {
                string = inputString.input(br);
                if (validator.validate(string)) {
                    Long number = Long.parseLong(string);
                    System.out.println(NumberAsText.numberAsText(number));
                    System.out.println(MyString.TASK_05_EXIT);
                }
            } while (!string.equals("0"));
        }
        br.close();
    }
}
