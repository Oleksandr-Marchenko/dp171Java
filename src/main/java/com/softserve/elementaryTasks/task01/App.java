package com.softserve.elementaryTasks.task01;

import com.softserve.elementaryTasks.MyString;
import com.softserve.elementaryTasks.input.Converter;
import com.softserve.elementaryTasks.input.InputChessBoardConsole;
import com.softserve.elementaryTasks.input.InputListArguments;
import com.softserve.elementaryTasks.task01.model.ChessBoard;
import com.softserve.elementaryTasks.validation.ChessValidation;
import com.softserve.elementaryTasks.validation.ListValidator;
import com.softserve.elementaryTasks.view.ViewChessBoard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(MyString.TASK_01_DESCRIPTION);

        InputListArguments console = new InputChessBoardConsole();
        ListValidator<Integer> validator = new ChessValidation();
        Converter converter = new Converter();

        List<String> inputArguments = new ArrayList<>();
        List<Integer> numbers;

        if (ListValidator.checkAnswer(MyString.INPUT_STRING_TO_TASK_01, br)) {
            do {
                inputArguments = console.input(br);
                numbers = converter.stringToInt(inputArguments);
            }
            while (validator.validate(numbers));
        } else {
            do {
                inputArguments.add(args[0]);
                inputArguments.add(args[1]);
                numbers = converter.stringToInt(inputArguments);
            } while (validator.validate(numbers));
        }

        new ViewChessBoard().view(new ChessBoard(numbers.get(0), numbers.get(1)));
        br.close();
    }
}
