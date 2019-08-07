package com.softserve.elementaryTasks.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public interface InputListArguments {

    List<String> input(BufferedReader br) throws IOException;

}
