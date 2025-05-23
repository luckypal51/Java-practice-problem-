package QuickSort;

import java.util.Arrays;

public class OuickSort {
    public static void main(String[] args) {
        int [] arr ={12,10,11};
        System.out.println(Arrays.toString(Quick(arr,0,arr.length-1)));
    }
    public static int [] Quick(int [] arr,int low ,int High){
            if(low>=High){
                return arr;

            }
            int s =part(arr,low,High);
            Quick(arr, low,s-1);
            Quick(arr,s,High);
            return arr;
    }
    public static int part(int[] arr,int low ,int high){
        int s = low;
        int e = high;
        int mid = arr[(low+high)/2];
        while(s<=e){
            while (arr[s]<mid){
                s++;
            }
            while(arr[e]>mid){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        return s;
    }
}
