package Practice;

import java.util.Scanner;

public class Recurssion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if (n==100) {
            return;
        }
        System.out.println(n);
       
            print(++n);
        
    }
}
