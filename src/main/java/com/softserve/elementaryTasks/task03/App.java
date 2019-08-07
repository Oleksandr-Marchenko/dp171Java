package com.softserve.elementaryTasks.task03;

import com.softserve.elementaryTasks.MyString;
import com.softserve.elementaryTasks.input.InputListArguments;
import com.softserve.elementaryTasks.input.InputTriangleSidesConsole;
import com.softserve.elementaryTasks.task03.model.Triangle;
import com.softserve.elementaryTasks.task03.model.TriangleFactory;
import com.softserve.elementaryTasks.validation.ListValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(MyString.TASK_03_DESCRIPTION);
        List<Triangle> triangleList = new ArrayList<>();
        Triangle triangle;


        triangle = addNewTriangle(br);
        triangleList.add(triangle);

        while (ListValidator.checkAnswer(MyString.QUESTION_TASK_03, br)) {

            triangle = addNewTriangle(br);
            triangleList.add(triangle);
        }

        TriangleCalculateSquare square = new TriangleCalculateSquare(triangleList);
        Map<Triangle, Double> listOfTrianglesSquare = square.calculateSquareTriangles();

        listOfTrianglesSquare.entrySet().stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new)).
                forEach((k, v) -> System.out.println("[" +
                        "Triangle " + k.getTriangleName() + "]: " +
                        v.toString() + " cm" + "\n"));

//        for (Map.Entry<Triangle, Double> entry : map.entrySet()) {
//            System.out.print("[" + "Triangle " + entry.getKey().getTriangleName() + "]: " + entry.getValue().toString() + " cm" + "\n");
//        }
        br.close();
    }

    private static Triangle addNewTriangle(BufferedReader br){
        Triangle triangle = null;
        do {
            try {
                triangle = TriangleFactory.createTriangle(addNewSides(br));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (triangle == null);
        return triangle;
    }

    private static List<String> addNewSides(BufferedReader br) throws IOException {
        InputListArguments console = new InputTriangleSidesConsole();

        return console.input(br);
    }
}
