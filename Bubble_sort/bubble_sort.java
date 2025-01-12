package Bubble_sort;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
    private static int [] sort(int arr[]){
       
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int start =0;
                    start = arr[j];
                    arr[j] = arr[j+1];
                    arr [j+1] = start;
                }
            }
        }
        return arr;
    }
}
