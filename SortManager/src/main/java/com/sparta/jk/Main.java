package com.sparta.jk;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] integerArray = {2, 1, 4, 2, 5, 1, 3}; //Integer array

        int[] sortedIntArr1 = {1, 4, 6, 7, 11}; //sorted int array1
        int[] sortedIntArr2 = {2, 3, 5, 7, 9, 12}; //sorted int array2

        int[] intArr = {1, 4, 11, 2, 1, 2, 6, 3, 2, 8, 9, 2}; //unsorted int array

        SortCollection sortCollection = new SortCollection();

        System.out.println("bubble sort asc                    " + Arrays.toString(sortCollection.bubbleSortAsc(integerArray)));
        System.out.println("bubble sort desc                   " + Arrays.toString(sortCollection.bubbleSortDesc(integerArray)));

        System.out.println("merge two sorted arrays asc        " + Arrays.toString(sortCollection.mergeTwoArraysAsc(sortedIntArr1, sortedIntArr2)));

        System.out.println("merge sort (divide and conquer)    " + Arrays.toString(sortCollection.mergeSort(intArr)));

        System.out.println("binary tree asc                    " + Arrays.toString(sortCollection.binaryTree(intArr).getSortedTreeAsc()));
        System.out.println("binary tree desc                   " + Arrays.toString(sortCollection.binaryTree(intArr).getSortedTreeDesc()));

    }
}
