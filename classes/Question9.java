package classes;

import java.util.Scanner;

public class Question9 {



    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int c = sc.nextInt();
         int n = sc.nextInt();
        int sum = c -n*(n+1)/2;
        if(sum >=0){
            sum = sum%n;

        }else{
            sum = c;
        }
        System.out.println(sum);
    }
}
