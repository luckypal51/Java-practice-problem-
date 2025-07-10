package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        for(int i =0;i<a;i++){
            for (int j=0;j<n;j++){
                int temp =arr[j];
                arr[j] =arr[arr.length-1];
                arr[arr.length-1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
