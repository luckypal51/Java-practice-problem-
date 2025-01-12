 package Practice;

import java.util.Arrays;

public class Question1 {
     public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int i =0;
        int j = arr.length-1;
        while (i<j) {
            int one=0;
            int two=0;
           one = arr[i] ;
           two =  arr[j];
            arr[j]=one;
           arr[i]= two;
         i++;
         j--;
        }
        System.out.println(Arrays.toString(arr));
     }
    
}