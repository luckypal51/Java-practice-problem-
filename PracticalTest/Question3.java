package PracticalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        String s = "abcbdab";
        String k = "bdcab";
        ArrayList<String> arr1 = check(s,"");
        ArrayList<String> arr2 = check(k,"");
        System.out.println(arrequal(arr1,arr2));
    }
    public static ArrayList<String>  check(String s,String ans){
        ArrayList<String> arr = new ArrayList<>();
        if(s.equals("")){
            arr.add(ans);
            return new ArrayList<>(arr);
        }
        arr.addAll(check(s.substring(1),ans+s.charAt(0)));
        arr.addAll(check(s.substring(1),ans));
        return arr;

    }
    public static String arrequal(ArrayList<String> arr1,ArrayList<String>arr2){
        int ans =-1;
        int max =0;
        for(int i =0;i<arr1.size();i++){
            for(int j=0;j<arr2.size();j++){
                if(arr1.get(i).equals(arr2.get(j))){
                    if(arr1.get(i).length()>max){
                        max = arr1.get(i).length();
                         ans = i;
                    }
                }
            }
        }
        if(ans==-1){
           return "no common subsequence";
        }
        return arr1.get(ans);
    }
}
