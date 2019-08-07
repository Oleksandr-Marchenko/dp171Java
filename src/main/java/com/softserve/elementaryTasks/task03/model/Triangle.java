package com.softserve.elementaryTasks.task03.model;

public class Triangle {

    private String triangleName;
    private double leftSide;
    private double rightSide;
    private double bottomSide;

    public Triangle(String triangleName, double leftSide, double rightSide, double bottomSide) {
        this.triangleName = triangleName;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.bottomSide = bottomSide;
    }

    public String getTriangleName() {
        return triangleName;
    }

    public double getLeftSide() {
        return leftSide;
    }

    public double getRightSide() {
        return rightSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

}
