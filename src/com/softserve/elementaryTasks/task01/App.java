package com.softserve.elementaryTasks.task01;

import com.softserve.elementaryTasks.task01.model.Board;
import com.softserve.elementaryTasks.util.ScanUtil;

public class App {

    public static void main(String[] args) {

        System.out.println("Нажмите Y для ввода высоты и ширины доски или нажмите N для выбора значений по умолчанию");
        String answer = ScanUtil.getString();
        if ((answer.equals("Y")) || (answer.equals("y"))) {
            System.out.println("Введите высоту");
            int boardHeight = ScanUtil.getInt();
            System.out.println("Введите ширину");
            int boardWidth = ScanUtil.getInt();

            PrinterBoard printerBoard = new PrinterBoard(new Board(boardHeight, boardWidth));

            printerBoard.printChessBoard();
        } else if (answer.equals("N") || (answer.equals("n"))) {
            PrinterBoard printerBoard = new PrinterBoard(new Board
                    (Integer.parseInt(args[0]), Integer.parseInt(args[1])));

            printerBoard.printChessBoard();
        }
    }
}
