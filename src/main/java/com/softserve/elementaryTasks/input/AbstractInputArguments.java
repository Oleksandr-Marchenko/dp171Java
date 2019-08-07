//package com.softserve.elementaryTasks.input;
//
//import java.util.List;
//
//abstract class AbstractInputArguments implements InputListArguments {
//
//    static double[] stringToDouble(String[] arguments) {
//        double[] args = new double[arguments.length];
//        for (int i = 0; i < args.length; i++) {
//            args[i] = Double.parseDouble(arguments[i]);
//        }
//        return args;
//    }
//
////    @Override
////    public int[] input() {
////        return new int[0];
////    }
////
////    @Override
////    public int[] input(String[] args) {
////        return new int[args.length];
////    }
//
//    @Override
//    public double[] inputDouble() {
//        return new double[0];
//    }
//
//    @Override
//    public double[] inputDouble(String[] args) {
//        return new double[args.length];
//    }
//
//    public String getAnswer() {
//        return SCANNER.nextLine();
//    }
//}
