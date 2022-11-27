package com.sparta;

import static com.sparta.Printer.printSorted;

public class Sorter {
    protected static boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static String bubbleSort(int[] arr) {
        int temp = 0;

        while(!isSorted(arr)) {
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return printSorted(arr);
    }

    public static String mergeSort(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int arr1Position = 0;
        int arr2Position = 0;
        int arr3Position = 0;

        while(arr1Position < arr1.length && arr2Position < arr2.length) {
            if(arr1[arr1Position] < arr2[arr2Position]) {
                arr3[arr3Position++] = arr1[arr1Position++];
            } else {
                arr3[arr3Position++] = arr2[arr2Position++];
            }
        }

        while(arr1Position < arr1.length) {
            arr3[arr3Position++] = arr1[arr1Position++];
        }

        while(arr2Position < arr2.length) {
            arr3[arr3Position++] = arr2[arr2Position++];
        }

        return printSorted(arr3);
    }
}
