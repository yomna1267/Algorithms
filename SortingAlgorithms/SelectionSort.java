package com.Sorting;

public class SelectionSort {
    public static void sort(int[] array){
        for (int i = 0; i < array.length; ++i){
            int minimumIndex = i;
            for(int l = i + 1; l < array.length; ++l){
                if(array[l] < array[minimumIndex])
                    minimumIndex = l;
            }
            int temp = array[i];
            array[i] = array[minimumIndex];
            array[minimumIndex] = temp;
        }
    }
}
