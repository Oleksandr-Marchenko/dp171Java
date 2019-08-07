package com.softserve.elementaryTasks.validation;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public interface ListValidator<T> {

    boolean validate(List<T> arguments);
    boolean isCorrectSize(List<T> arguments);

    static boolean checkAnswer(String str, BufferedReader br) throws IOException {
        System.out.println(str);

        return br.readLine().toLowerCase().equals("y") || br.readLine().toLowerCase().equals("yes");
    }

}
