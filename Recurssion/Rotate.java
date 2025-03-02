package Recurssion;

public class Rotate {
    public static void main(String[] args) {
          int[] arr ={5,6,7,8,9,1,2,3};
          int start =0;
          int end = arr.length-1;
          System.out.print("the index value is : "+rotate(arr,9,start,end));
    }
    public static int rotate(int[] arr,int k,int start,int end){
       int mid = start+(end-start)/2;
       if(start>end){
           return -1;
       }
       if (arr[mid]==k){
           return mid;
       }
       if(arr[start]<=arr[mid]){
           if(k>=arr[start]&&k<=arr[mid]){
             return rotate(arr, k, start, mid-1);
           }
           else{
               return rotate(arr, k, mid+1, end);
           }
       }
       if(k>=arr[mid]&& k<=arr[end]){
           return rotate(arr, k, mid+1, end);
       }
       else{
           return rotate(arr, k, start, mid-1);
       }

    }
}
