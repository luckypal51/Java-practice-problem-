package Recurssion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {45,5,12,4,6,};
        System.out.println(Arrays.toString(sortStart(arr)));
    }

    public static int[] sortStart(int[] arr) {
        return sort(arr,0,0);

    }
    public static int[] sort(int[] arr,int i,int k){
       if(k>= arr.length){
           return arr;
       }
       if (i>=arr.length){
           return sort(arr, k+1, k+1);
       }
       if(arr[i]<arr[k]){
           int temp = arr[i];
           arr[i] = arr[k];
           arr[k] = temp;
//
       }

           return sort(arr, i+1, k);

    }
}
