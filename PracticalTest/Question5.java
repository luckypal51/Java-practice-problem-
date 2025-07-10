package PracticalTest;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[k];
        for (int i =0;i< k;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans =0;
        for (int i =0;i< arr.length-n;i++){
            ans+= arr[i];
        }

        System.out.println(ans+n);
    }
}
