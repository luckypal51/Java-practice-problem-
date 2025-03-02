package SelectionSort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int min = arr[i];
            int index =-1;
            for (int j = i+1; j < arr.length; j++) {
                if(min>arr[j]){
                    min = arr[j];
                    index =j;
                }
            }
            if(index!=-1){
                int temp = arr[i];
                arr[i] =arr[index];
                arr[index] = temp;
            }

        }
        return arr;
    }
}
