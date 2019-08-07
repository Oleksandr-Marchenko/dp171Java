package com.softserve.elementaryTasks.view;

import com.softserve.elementaryTasks.task01.model.ChessBoard;

import static java.lang.System.out;

public class ViewChessBoard implements View<ChessBoard> {

    @Override
    public void view(ChessBoard board) {
        for (int i = 0; i <= board.getHeight(); i++) {
            for (int j = 0; j <= board.getWidth(); j++) {
                if ((i + j) % 2 == 0) {
                    out.print("*");
                } else {
                    out.print(" ");
                }
            }
            out.println();
        }
    }
}
