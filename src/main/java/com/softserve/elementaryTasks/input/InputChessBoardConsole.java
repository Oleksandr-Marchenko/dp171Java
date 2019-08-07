package com.softserve.elementaryTasks.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputChessBoardConsole implements InputListArguments {

    @Override
    public List<String> input(BufferedReader br) throws IOException {

        String boardHeight = null;
        String boardWidth = null;
        try {
            System.out.println("Enter height");
            boardHeight = br.readLine();
            System.out.println("Enter Width");
            boardWidth = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        br.close();

        return new ArrayList<>(Arrays.asList(boardHeight, boardWidth));
    }
}
