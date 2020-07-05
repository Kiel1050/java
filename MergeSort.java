/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nttun
 */
public class MergeSort {   
    static void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (r + l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            MergeSortedArray.merge(arr, l, m, r);
        }
    }
}
