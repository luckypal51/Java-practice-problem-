package classes;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int t =sc.nextInt();
       while (t>0){
           int w = sc.nextInt();
           int h = sc.nextInt();
           upload(l,w,h);
           t--;
       }
    }
    public static void upload(int l,int w,int h){
        if(l==w&&l==h){
            System.out.println("Accepted");
        } else if (l>w||l>h) {
            System.out.println("Upload another");
        }
        else{
            System.out.println("crop it");
        }
    }
}
