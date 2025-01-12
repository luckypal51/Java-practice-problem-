package Practice;

import java.util.Arrays;

public class reversing {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int n = arr.length-1;
        int t =0;
        int temp =0;
           for(int i =0;i<n;i++){
            temp = arr[i];
            arr[i] = arr[n];
            arr[n]= temp;
             n--;
           } 
           System.out.println(Arrays.toString(arr));
        }
        
    }

