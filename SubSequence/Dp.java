package SubSequence;

import java.util.Arrays;

public class Dp {
    public static void main(String[] args) {
        int [] arr = {0,1,3,5,6,8,12,17};
        boolean[] v = new boolean[arr.length+1];
        System.out.println(frog(arr,0,0,v));
        System.out.println(Arrays.toString(v));
    }
   public static boolean frog(int [] arr, int index,int jump,boolean[] v){
        if(index==arr.length-1&& jump==arr[arr.length-1]){
            return true;
        }
        if(index>arr.length-1)
         v[index] = true;
        if(index==0){
            jump+=arr[index];
            return frog(arr, index+1, jump+1,v);
        }
        if(jump==arr[index]){
            jump+=arr[index];
            return frog(arr, index+1, jump+1,v)||frog(arr, index+1, jump-1,v);
        }
            return frog(arr, index+1, jump,v);


   }

}
