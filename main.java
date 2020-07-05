
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nttun
 */
public class main {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = rd.nextInt(101);
        }
        printArr.print(arr);
        
        MergeSort.sort(arr, 0, 9);
        printArr.print(arr);
    }
}
