package Practice;

import java.util.Arrays;

public class Zero {
      public static void main(String[] args) {
        int []arr ={1,0,2,0,3,0,5};
        int l = arr.length;
        int count = 0;
        for(int i =0;i<arr.length;i++){
             if(arr[i]!=0){
                arr[count++] = arr[i];

             } 
        }
        while (count<l) {
            arr[count++] = 0;
        }
System.out.println(Arrays.toString(arr));
        }
      }

