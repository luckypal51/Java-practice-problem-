package Bubble_sort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int [] arr ={5,6,2,3,1,4,5};
        System.out.print(Arrays.toString(sort(arr)));
    }
   public static int[] sort(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        return arr;
   }
}
