package BinarySearch;

public class binarysearch {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,80,90,100};
        int target = 10;
        System.out.println(search(arr, target));;
    }
// its return-1 if the target is not found 
// its going to return the index of the element 
    static int search(int[]arr,int target){
      int start = 0;
      int end = arr.length-1;
      while (start<=end) {
       // int mid = (start+end)/2; its going to show error if the start+end exceeds the numeric value of the Integer in the java 
       int mid = start+(end-start)/2;
       if (target<arr[mid]) {
        end = mid-1;
       }
       else if (target>arr[mid]) {
        start = mid +1;
       }
       else{
        return mid;
       }
      }
      return -1;
    }
}
