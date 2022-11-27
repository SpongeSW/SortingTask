package com.sparta;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    @Test
    void bubbleSortTestPos() {
        int[] testArray = {5, 2, 13, 8, 27, 1};
        String expected = "1 2 5 8 13 27 ";
        String result = Sorter.bubbleSort(testArray);

        assertEquals(expected, result);
    }

    @Test
    void bubbleSortTestNeg() {
        int[] testArray = {-5, -2, -13, -8, -27, -1};
        String expected = "-27 -13 -8 -5 -2 -1 ";
        String result = Sorter.bubbleSort(testArray);

        assertEquals(expected, result);
    }

    @Test
    void mergeSortTestPos() {
        int[] testArray1 = {1, 2, 5, 8, 13, 27};
        int[] testArray2 = {1, 23, 32, 54, 59, 67, 76, 80, 100};
        String expected = "1 1 2 5 8 13 23 27 32 54 59 67 76 80 100 ";
        String result = Sorter.mergeSort(testArray1, testArray2);

        assertEquals(expected, result);
    }

    @Test
    void mergeSortTestNeg() {
        int[] testArray1 = {-27, -13, -8, -5, -2, -1};
        int[] testArray2 = {-100, -80, -76, -67, -59, -54, -32, -23, -1};
        String expected = "-100 -80 -76 -67 -59 -54 -32 -27 -23 -13 -8 -5 -2 -1 -1 ";
        String result = Sorter.mergeSort(testArray1, testArray2);

        assertEquals(expected, result);
    }

    @Test
    void mergeSortTestMix() {
        int[] testArray1 = {-13, -8, -5, 1, 2, 13, 27};
        int[] testArray2 = {-67, -59, -1, 23, 32, 54, 76, 80, 100};
        String expected = "-67, -59, -13, -8, -5, -1, 1, 2, 13, 23, 27, 32, 54, 76, 80, 100 ";
        String result = Sorter.mergeSort(testArray1, testArray2);

        assertEquals(expected, result);
    }
}