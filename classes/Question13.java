package classes;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        String [] s= {"geeks","for","geeks","contribute","practice"};
        String word1 ="geeks";
        String word2 ="practice";
        int word1max =-1;
        int word2max =-1;
        for (int i=0;i<s.length;i++){
            if(s[i].equals(word1)){
                word1max =Math.max(word1max,i);
            }
            if(s[i].equals(word2)){
                word2max =Math.max(word2max,i);
            }
        }
        int result=0;
        if(word1max>word2max){
            result = word1max-word2max;
        }else{
            result = word2max-word1max;
        }
        System.out.println(result);
        int [] arr = {1, 7, 6, 1, 2, 10, 2};
        System.out.println(sumSubMins(arr));
    }
    public static int sumSubMins(int[] arr) {
        // code here
        int sum =0;
        int k = arr.length-1;
        for(int i=0;i<arr.length;i++){
            sum += arr[i]*k;
            if(k>1){
                k--;
            }
        }
        return sum;
    }
}
