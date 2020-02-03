package com.sparta.jk;

import java.util.Arrays;

/*
- Uses a merge sort (divide and conquer) to sort an array
 */

public class MergeSort {

    public int[] sort(int[] arr) {
        int[] l = Arrays.copyOfRange(arr, 0, arr.length / 2); //copies first half of arr
        int[] r = Arrays.copyOfRange(arr, arr.length / 2, arr.length); //copies second half of arr

        if (arr.length > 1) {
            l = sort(l);
            r = sort(r);
        }
        return merge(l, r);

    }


    //merges two ordered arrays by taking top from whatever is smallest
    public int[] merge(int[] intArray1, int[] intArray2) {

        int[] newArray = new int[(intArray1.length + intArray2.length)]; //initialises newArray after lengths of input arrays can be determined
        int pointer1 = 0;
        int pointer2 = 0;
        int newPointer = 0;

        while (pointer1 < intArray1.length && pointer2 < intArray2.length) { //while neither array has finished, take smallest number from head of either
            if (intArray1[pointer1] < intArray2[pointer2]) { //if head of array1 has smaller value
                newArray[newPointer] = intArray1[pointer1]; //add value at head of array1 to new array
                newPointer++;
                pointer1++;
            } else { //if head of array2 has smaller value
                newArray[newPointer] = intArray2[pointer2]; //add value at head of array2 to new array
                newPointer++;
                pointer2++;
            }
        }
        if (pointer1 >= intArray1.length) { //once all values reached from one array, empty rest of other array
            while (pointer2 < intArray2.length) {
                newArray[newPointer] = intArray2[pointer2];
                newPointer++;
                pointer2++;
            }
        } else {
            while (pointer1 < intArray1.length) {
                newArray[newPointer] = intArray1[pointer1];
                newPointer++;
                pointer1++;
            }
        }
        return newArray;
    }
}