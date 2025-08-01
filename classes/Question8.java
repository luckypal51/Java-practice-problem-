package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question8 {
    public static void main(String[] args) {
        int [] arr ={1,1,3};
        int [] re ={2,6,8,9};
        System.out.println(sortmerge(arr, re));
    }
    public static int [] check(int []arr){
        int [] re = new int[arr.length];
        int index =0;
        for(int a:arr){
            if(a!=0){
                re[index] = a;
                index++;
            }
        }
        return re;
    }
    public static int major(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i :arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int max =Integer.MIN_VALUE;
        int  v =0;
        for(Map.Entry<Integer, Integer> a:map.entrySet()){
            if(a.getValue()>=arr.length/2){
              if(a.getValue()>max){
                  max = a.getValue();
                 v=a.getKey();
              }
            }
        }
        return v;
    }
    public static ArrayList<Integer> sortmerge(int []arr1, int []arr2){
        ArrayList<Integer> arr = new ArrayList<>();
        int i =0;
        int j =0;

        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
               if(!arr.contains(arr1[i])){
                   arr.add(arr1[i++]);
               }
               else{
                   i++;
                }
            }else{
                if(!arr.contains(arr2[j])){
                    arr.add(arr2[j++]);
                }else {
                    j++;
                }
            }
        }
        while (i< arr1.length){
            if(!arr.contains(arr1[i])){
                arr.add(arr1[i++]);
            }else {
                i++;
            }
        }
        while (j< arr2.length){
            if(!arr.contains(arr2[j])){
                arr.add(arr2[j++]);
            }else{j++;
            }
        }
        return arr;
    }
}
