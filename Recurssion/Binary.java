package Recurssion;

public class Binary {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int n =4;
        int start =0;
        int end =arr.length-1;

        find(arr,n,start,end);
    }

   public static int find(int[]arr,int target,int start,int end){
        int mid = start+(end-start)/2;
        if (start>end){
            System.out.println("Element not found!");
            return -1;
        }
        if(arr[mid]==target){

            System.out.println(mid);
            return mid;
        }
        if (arr[mid]>target){
            mid = mid-1;
            end = mid;
            return find(arr,target,start,end);
        }

            return find(arr,target,mid+1,end);
        // make sure when the function have the return type and you are recursive using it call it in return key word;
   }
}
