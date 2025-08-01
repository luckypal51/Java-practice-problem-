package SAP_lab;

import java.util.ArrayList;
import java.util.Scanner;

public class Trainee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverseWords("the sky is blue"));
        int a = sc.nextInt();
        int average =0;
        int [] arr = new int[a];
        for(int i =0;i<3;i++){
            for(int j =0;j<a;j++){
                arr[j]+=sc.nextInt();
            }
        }
        for(int i: arr){
            average+=i;

        }
        average/=a*3;
        if(average<=70){
            System.out.println("low oxygen level");
        }else{
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if((arr[i]/3)==average){
                result.add(i+1);
            }
        }
        System.out.println(result);}
    }

        public static String reverseWords(String s) {
            s= s.trim();
            String[] arr = s.split(" ");
            int start =0;
            int end =arr.length-1;
            while(start<end){
                String a = arr[start];
                arr[start] = arr[end];
                arr[end] = a;
                start++;
                end--;
            }
            String r = "";
            for(int i=0;i<arr.length-1;i++){
                r+=arr[i]+" ";
            }
            r+=arr[arr.length-1];
            return r;
        }

}
