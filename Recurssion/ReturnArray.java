package Recurssion;

import java.util.ArrayList;

public class ReturnArray {
    public static void main(String[] args) {
        int [] arr = {1,6,3,6,7,5,6,4,8,6};
        int value = 6;
        System.out.println("This index of the value are : "+check(arr,value));
    }
    public static ArrayList<Integer> check(int []arr,int value){
        ArrayList<Integer> list = new ArrayList<>();
        return helper(arr,value,0,list);
    }
    public static ArrayList<Integer> helper(int []arr,int value, int index, ArrayList<Integer> list){
        if(index>= arr.length){
            return list;
        }
        if(arr[index]==value){
            list.add(index);
        }
        return helper(arr,value,index+1,list);
    }
}
