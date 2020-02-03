package com.sparta.jk;

/*
- performs bubble sort on input array of ints (intArray)
- Use sortAsc() for ascending order, and sortDesc for descending order
 */

public class BubbleSort {
    public <T extends Comparable<T>> T[] sortAsc(T[] array) {
        int pointer = 0; //points to current location in array
        while (pointer < array.length - 1) { //loop until the array is sorted (end of array reached)
            if (isBiggerThanNext(pointer, array)) { //checks if current pointer location is bigger than next location
                swap(pointer, array); //swaps if value at pointer+1 is smaller than at pointer
                pointer = 0; //reset pointer when swap occurs
            } else {
                pointer++; //increment pointer when the order is correct at pointer and pointer+1
            }
        }
        return array;
    }

    public <T extends Comparable<T>> T[] sortDesc(T[] array) {
        int pointer = 0; //points to current location in array
        while (pointer < array.length - 1) { //loop until the array is sorted (end of array reached)
            if (isSmallerThanNext(pointer, array)) { //checks if current pointer location is smaller than next location
                swap(pointer, array); //swaps if value at pointer+1 is bigger than at pointer
                pointer = 0; //reset pointer when swap occurs
            } else {
                pointer++; //increment pointer when the order is correct at pointer and pointer+1
            }
        }
        return array;
    }

    private <T extends Comparable<T>> void swap(int i, T[] array) { //swaps ints at i and i+1
        T temp = array[i]; //stores int at i in temp
        array[i] = array[i + 1]; //puts i+1 where i is
        array[i + 1] = temp; // puts stored int at i+1
    }

    private <T extends Comparable<T>> boolean isBiggerThanNext(int i, T[] array) { //if i is greater than i+1, return true, else return false
        return (array[i].compareTo(array[i + 1]) > 0);
    }

    private <T extends Comparable<T>> boolean isSmallerThanNext(int i, T[] array) { //if i is smaller than i+1, return true, else return false
        return (array[i].compareTo(array[i + 1]) < 0);
    }

}