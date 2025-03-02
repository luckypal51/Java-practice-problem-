package Recurssion;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int []arr={1,9,6,3,7,5};
        System.out.println(Arrays.toString(sort(arr,0,0)));
    }
    public static int[] sort(int arr[],int i,int k){
        int n = arr.length;
        if(k==n-1){
            return arr;
        }

        if(arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        if(i==n-2-k){
          return sort(arr, 0, k+1);
        }
            return sort(arr,i+1,k);

    }
}
