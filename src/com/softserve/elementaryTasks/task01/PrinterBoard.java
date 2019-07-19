package com.softserve.elementaryTasks.task01;

import com.softserve.elementaryTasks.task01.model.Board;

public class PrinterBoard {

    private Board board;

    public PrinterBoard(Board board) {
        this.board = board;
    }

    public void printChessBoard() {
        for (int i = 0; i <= board.getHeight(); i++) {
            for (int j = 0; j <= board.getWidth(); j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
