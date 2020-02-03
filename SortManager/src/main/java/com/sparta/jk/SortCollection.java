package com.sparta.jk;

public class SortCollection {
    private BubbleSort bubbleSort = new BubbleSort();
    private MergeTwoArrays mergeTwoArrays = new MergeTwoArrays();
    private MergeSort mergeSort = new MergeSort();
    private BinaryTree binaryTree;

    public <T extends Comparable<T>> T[] bubbleSortAsc(T[] arr) {
        return bubbleSort.sortAsc(arr);
    }

    public <T extends Comparable<T>> T[] bubbleSortDesc(T[] arr) {
        return bubbleSort.sortDesc(arr);
    }

    public int[] mergeTwoArraysAsc(int[] arr1, int[] arr2) {
        return mergeTwoArrays.merge(arr1, arr2);
    }

    public int[] mergeSort(int[] arr) {
        return mergeSort.sort(arr);
    }

    public BinaryTree binaryTree(int[] arr) {
        binaryTree = new BinaryTreeImpl(arr);
        return binaryTree;
    }
    
}
