package Practice;

import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            int c = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((c*4)+(b*2));
            t--;
        }
    }
}
