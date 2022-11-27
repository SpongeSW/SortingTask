package com.sparta;

public class Printer {
    public static String printSorted(int[] arr) {
        String result = "";

        for(int i = 0; i < arr.length; i++) {
            result += arr[i] + " ";
        }
        return result;
    }
}
