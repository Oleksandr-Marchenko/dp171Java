package com.softserve.elementaryTasks.input;

import com.softserve.elementaryTasks.MyString;

import java.io.BufferedReader;
import java.io.IOException;

public class InputNumberAsTextConsole implements InputStringArgument {

    @Override
    public String input(BufferedReader br) throws IOException {

        System.out.println(MyString.INPUT_STRING_TO_TASK_05);

        return br.readLine();
    }
}
