package com.Sorting;

public class MergeSort {
    public static void  merge(int [] array, int l, int m, int r){
        int sz1 = r - m;
        int sz2 = m - l + 1;
        int R_array [] = new int[sz1];
        int L_array[] = new int[sz2];
        for(int i = 0; i < sz1; ++i){
            R_array[i] = array[m + 1 + i];
        }
        for(int i = 0; i < sz2; ++i){
            L_array[i] = array[l + i];
        }
        int R = 0, L = 0, k = l;
        while(R < sz1 && L < sz2){
            if(R_array[R] < L_array [L]){
                array[k] = R_array[R];
                R++;
            }
            else{
                array[k] = L_array[L];
                L++;
            }
            k++;
        }
        while (R < sz1){
            array[k] = R_array[R];
            R++;
            k++;
        }
        while (L < sz2){
            array[k] = L_array[L];
            L++;
            k++;
        }
    }
    public static void sort(int [] array, int l, int r){
        if(l < r){
            int m = l + (r - l)/2;
            sort(array, m+1, r);
            sort(array, l, m);
            merge(array, l, m, r);
        }
        
    }
}
