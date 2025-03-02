package Recurssion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={1,5,45,56,5865,45526,452,552};
        System.out.println("The index value is : "+linearsearch(arr,56));
    }

    private static int linearsearch(int[] arr,int value) {
        return helper(arr,value,0);
    }
    public static  int helper(int[]arr, int value, int index){
        if(index>=arr.length){
            return -1;
        }
        if(arr[index]==value){
            return index;
        }
        return helper(arr,value,++index);
    }
}
