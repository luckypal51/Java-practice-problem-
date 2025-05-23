package Recurssion;


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr ={1,6,5,9,3,5,7,8,4};
        System.out.println(Arrays.toString(sort(arr,0,arr.length-1)));
    }
    public static int [] sort(int []arr,int left,int right){
        if(left>=right){
            return arr;
        }else{
            int[] part = partition(arr, left, right);

            sort(arr,left,part[0]-1);
            sort(arr,part[1]+1,right);


            return arr;
        }

    }
    public static int[] partition(int []arr, int left,int right){
        int pivot = arr[right]; // Choosing last element as pivot
        int lt = left;   // Pointer for elements < pivot
        int gt = right;  // Pointer for elements > pivot
        int i = left;

        while (i <= gt) {
            if (arr[i] < pivot) {
                swap(arr, i, lt);
                lt++;
                i++;
            } else if (arr[i] > pivot) {
                swap(arr, i, gt);
                gt--;
            } else {
                i++;
            }
        }
        return new int[]{lt, gt}; // Returning indices of duplicate range
    }
    public static int[] swap(int []arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
