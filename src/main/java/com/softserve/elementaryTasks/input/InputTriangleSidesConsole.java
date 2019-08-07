package com.softserve.elementaryTasks.input;

import com.softserve.elementaryTasks.MyString;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputTriangleSidesConsole implements InputListArguments {

    @Override
    public List<String> input(BufferedReader br) throws IOException {
        System.out.println(MyString.INPUT_STRING_TO_TASK_03);
        String[] params = br.readLine().trim().toLowerCase().split(",");

        return new ArrayList<>(Arrays.asList(params));
    }
}
