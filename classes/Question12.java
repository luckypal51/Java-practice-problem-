package classes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
//write a program to reduce a string only basisi of given contiom
//1 ypou have to count the frequencyof that after chah
//2 you have to folow rule
// originally sequence should
public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String result="";
        int count =1;
        for (int i =1;i< arr.length;i++){
            if(arr[i-1]==arr[i]){
                count++;
            }else{
                result+=""+arr[i-1]+count;
                count=1;
            }
        }
        result+=""+arr[arr.length-1]+count;
        System.out.println(result);
    }
}
