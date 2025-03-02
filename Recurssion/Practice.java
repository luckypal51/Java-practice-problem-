package Recurssion;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        int [] arr ={5,2,3,4,5,6,7,8,9,5};
        int value = 5;
        System.out.println(check(arr,value,0));

    }
    public static ArrayList<Integer> check(int[] arr,int value,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index>=arr.length){
            return list;
        }
        // stores the value of current function calls
        if(arr[index]==value){
            list.add(index);
        }
//        ArrayList<Integer> collector = check(arr,value,index+1);
        list.addAll(check(arr, value, index+1));// here list will add all the answer it has from the pervious calls
        return list;
    }
}
