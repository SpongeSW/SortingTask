package com.sparta;

import static com.sparta.Printer.printSorted;

public class Starter {
    public static void start() {
        Sorter sorter = new Sorter();
        int[] arrayOfInts1 = {-13, -8, -5, 1, 2, 13, 27};
        int[] arrayOfInts2 = {-67, -59, -1, 23, 32, 54, 76, 80, 100};

        System.out.println(sorter.bubbleSort(arrayOfInts1));
        System.out.println(sorter.bubbleSort(arrayOfInts2));

        System.out.println(sorter.mergeSort(arrayOfInts1, arrayOfInts2));
    }
}
