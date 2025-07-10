package PracticalTest;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int [][] arr = new int[n][m];
        int left =0;
        int right = m-1;
        int top = 0;
        int down = n-1;
        while(left<=right&&top<=down){
            for(int i =left;i<=right;i++){
                arr[top][i] = sc.nextInt();


            }
            top++;
            for(int i=top;i<=down;i++){
                arr[i][right] = sc.nextInt();

            }
            right--;
            if (top <= down) {
                // Fill bottom row (right to left)
                for (int i = right; i >= left; i--) {
                    arr[down][i] = sc.nextInt();
                }
                down--;
            }

            if (left <= right) {
                // Fill left column (down to top)
                for (int i = down; i >= top; i--) {
                    arr[i][left] = sc.nextInt();
                }
                left++;
            }
        }
        for (int [] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
