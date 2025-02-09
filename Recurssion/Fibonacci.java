package Recurssion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int ans =Fibo(n);
        System.out.println(ans);
    }
    public static int Fibo(int n){
        if(n==0){
            System.out.println(0);
            return 0;
        
        }
        if (n==1) {
            System.out.println(1);
            return 1;
        }
  

        int sum = Fibo(n-1)+Fibo(n-2);
        
        return sum;
        
    }
}
