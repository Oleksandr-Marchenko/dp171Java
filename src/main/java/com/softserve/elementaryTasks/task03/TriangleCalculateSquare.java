package com.softserve.elementaryTasks.task03;

import com.softserve.elementaryTasks.task03.model.Triangle;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class TriangleCalculateSquare {

    private List<Triangle> triangleList;

    TriangleCalculateSquare(List<Triangle> triangleList) {
        this.triangleList = triangleList;
    }


    Map<Triangle, Double> calculateSquareTriangles() {
        Map<Triangle, Double> triangleMap = new LinkedHashMap<>();
        Double[] p = calculateP();

        for (int i = 0; i < triangleList.size(); i++) {
            double square = Math.sqrt(p[i] *
                    (p[i] - triangleList.get(i).getLeftSide()) *
                    (p[i] - triangleList.get(i).getRightSide()) *
                    (p[i] - triangleList.get(i).getBottomSide()));
            triangleMap.put(triangleList.get(i), square);
        }
        return triangleMap;
    }

    private Double[] calculateP() {
        Double[] p = new Double[triangleList.size()];

        for (int i = 0; i < triangleList.size(); i++) {
            p[i] = (triangleList.get(i).getLeftSide() +
                    triangleList.get(i).getRightSide() +
                    triangleList.get(i).getBottomSide()) / 2;
        }
        return p;
    }
}
