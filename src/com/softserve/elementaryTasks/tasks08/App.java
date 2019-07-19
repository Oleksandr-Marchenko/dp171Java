package com.softserve.elementaryTasks.tasks08;

public class App {

    public static void main(String[] args) {


        for (int i = 6; i < 10; i++) {
            System.out.printf("%1d,", fibonachi(i));
        }

        int[] ints = fibMas(10);

        for (int i = 5; i < 10; i++) {
            System.out.printf("%1d,", ints[i]);
        }
    }


    static int[] fibMas(int countElementsN) {

        int[] masNumbersN = new int[countElementsN];
        for (int i = 0; i < masNumbersN.length; i++) {
            if (i < 2) {
                masNumbersN[i] = 1;
            } else {
                masNumbersN[i] = masNumbersN[i - 1] + masNumbersN[i - 2];
            }
        }
        return masNumbersN;
    }

    static int fibonachi(int i) {

        if ((i == 1) || (i == 2)) return 1;
        return fibonachi(i - 1) + fibonachi(i - 2);
    }
}

