package Patternprinting;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
import java.util.regex.Pattern;

public class slide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the pramid: ");
        int start = sc.nextInt();
        Pattern6(start);
        
    }
    public static void Pattern1(int start){
        for(int i =0;i<start;i++){
          
            for(int j =start-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int k =0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern2(int n){
        for(int i =1;i<=n;i++){
            for(int j =n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern3(int n){
        for(int i =1;i<n;i++){
          if(i<(n/2)){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
          }
          else{
             
             for(int j =n-i;j>0;j--){
                System.out.print("*");
             }
  
          }
          System.out.println();
        }
    }
    public static void Pattern4(int n ){
        for(int i =1;i<=n;i++){
         for(int j =0;j<i;j++){
            System.out.print(" ");
         }
         for(int k = n-i;k>=0;k--){
            System.out.print(" *");
         }
         System.out.println();
    }
}
public static void Pattern5(int n){
    for(int i =1;i<=n;i++){
        if(i<=(n/2)){
            for(int j =0;j<i;j++){
                System.out.print(" ");
             }
             for(int k = (n/2)-i;k>=0;k--){
                System.out.print(" *");
             }
             System.out.println();
        }else{
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int k =1;k<=i-(n/2);k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    
      
   }
}
public static void Pattern6(int n){
    for(int i =0;i<n;i++){
        if(i==0){
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<1;k++){
                System.out.print("*");
            }
        }
        else if (i<n-1) {
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<1;k++){
                System.out.print("*");
            }
            for(int l =0;l<2*i-1;l++){
                System.out.print(" ");
            } 
            for(int k=0;k<1;k++){
                System.out.print("*");
            }
        }
        else{
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int h =0;h<i*2;h++){
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
}