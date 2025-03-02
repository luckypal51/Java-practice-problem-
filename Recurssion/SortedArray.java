package Recurssion;

public class SortedArray {
    public static void main(String[] args) {
         int []arr ={1,2,3,4,5,6,8,9};
        System.out.println(Sort(arr));
    }
    public static Boolean Sort(int []arr){
       return helper(arr,0);
    }

    private static Boolean helper(int[] arr, int i) {
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return helper(arr,i+1);
    }
}
