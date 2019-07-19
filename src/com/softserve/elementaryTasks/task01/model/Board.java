package com.softserve.elementaryTasks.task01.model;

public class Board {

    private int height;
    private int width;

    public Board() {
    }

    public Board(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
