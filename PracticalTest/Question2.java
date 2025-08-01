package PracticalTest;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        String a ="a";
        System.out.println(a.CASE_INSENSITIVE_ORDER.toString());
        System.out.println(check("*##"));

    }
    public static int check(String s){
        int [] arr = new int [2];
        for(char a:s.toCharArray()){
            if(a=='*'){
                arr[0] +=1;
            }else{
                arr[1]+=1;
            }
        }
        return  arr[0]-arr[1];
    }
    public static String check2(String s){
        String [] arr = s.split(" ");
        return "";
    }
}
