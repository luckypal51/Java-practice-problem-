package classes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int [] arr ={1,2,3,4,5,6};
        System.out.println(Arrays.toString(bestIndex(arr)));
    }
    public static int getValidGroup(int remainingElement){
        double factor =(Math.sqrt(1+8*remainingElement)-1)/2;
        return remainingElement;
    }
    public static int [] bestIndex(int []arr){
        int[ ] a = new int[arr.length];
        for(int i =0;i< arr.length;i++){
            int sum =0;
            for(int j =i;j<arr.length;j++){
                sum+=arr[j];
            }
            a[i] = sum;
        }
        return a;
    }
}
