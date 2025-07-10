package Practice;

import java.util.Scanner;

public class Arithematic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        a =b-a;
        for (int i=2;i<n;i++){
            b+=a;
        }
        System.out.println(b);
    }
}
