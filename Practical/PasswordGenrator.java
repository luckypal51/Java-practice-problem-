package Practical;


import java.util.Random;
import java.util.Scanner;

public class PasswordGenrator {
    public static void main(String[] args) {
        String character ="abcdefghijklmnopqrstABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890/*-+<>!@#$%^&*";
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of password : ");
        int n = sc.nextInt();
        String password =new String();
        for (int i =0;i<n;i++){
            int j = rn.nextInt(character.length());
            password+=character.charAt(j);
        }
        System.out.println("Your password is : "+password);
    }
}
