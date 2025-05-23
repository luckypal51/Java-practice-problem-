package Permutation;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        System.out.println( permu("abc",""));
    }
    public static ArrayList<String> permu(String str, String ans){
        ArrayList<String> arr = new ArrayList<>();
        if(str.isEmpty()){
            arr.add(ans);
            return arr;
        }
        int i =0;
        while(i<=ans.length()){
            arr.addAll(permu(str.substring(1),ans.substring(0,i)+str.charAt(0)+ans.substring(i)));
            i++;
        }
        return arr;
    }
}
