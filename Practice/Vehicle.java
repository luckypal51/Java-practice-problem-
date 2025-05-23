package Practice;

import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nw = sc.nextInt();
        int fw = (nw-(2*n))/2;
        int tw = n - fw;
        System.out.println("number of four wheeler: "+fw);
        System.out.println("number of two wheeler: "+tw);

    }
}
