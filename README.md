# Sorting algorithm program

## Overview
    
In this project, I was tasked with developing a simple program that implements the bubble sort and merge sort algorithms.

### Bubble sort
For the bubble sort algorithm I decided to go for quite a straight-forward algorithm that goes through the entire array multiple times until it is sorted.

To know when the array is sorted, I made an `isSorted(int[] array)`method that returns a boolean when all the array's elements are in ascending order. While the array is not sorted, it compares the elements from index `0` to index `array.length - 2` to the elements from index `1` to index `array.length - 1`, meaning comparing immediate pairs.

If `a[i] > a[i+1]` then switch their positions with the help of a `temp` variable.

### Merge sort
For merge sort I have created a new array `arr3` in which to add the elements of `arr1` and `arr2` and since it needs to take in all of their elements, its size is `arr1.length + arr2.length`.

The algorithm compares the first value of `arr1` and `arr2` and put them in ascending order in `arr3`'s first and second positions. Same goes for the second, third, fourth and so on values of the two input arrays.

In order to account for difference in array sizes, I have created variables that keep track of their positions to compare whether either array reached its end. If one of them did not, that means it is the longer one and its remaining items will be appended at the end of `arr3` since they are already ordered.

### Testing
I have developed test suites that cover basic cases such as all positive, all negative and mixed integer numbers. All tests passed.

### Time efficiency
As an alternative to the algorithms, to improve the time efficiency I think `while` loops in `bubbleSort()` would be way better as, in its current condition, the program does some redundant checks when going through the array.