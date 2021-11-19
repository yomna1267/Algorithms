package com.Sorting;

public class QuickSort {
    public static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = (low - 1);
        for(int j = low; j < high; ++j){
            if(array[j] < pivot){
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;

            }
        }
        int temp = array [high];
        array[high] = array[i+1];
        array[i+1] = temp;
        return (i+1);
    }
    public static void sort(int[] array, int low, int high){
        if(low < high){
            int pivot_index = partition(array, low, high);
            sort(array, low, pivot_index-1);
            sort(array, pivot_index+1, high);
        }
    }
}
