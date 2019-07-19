package com.softserve.elementaryTasks.util;

import java.util.Scanner;

public class ScanUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static int getInt () {
        return Integer.parseInt(scanner.nextLine());
    }

    public static String getString () {
        return scanner.nextLine();
    }
}
