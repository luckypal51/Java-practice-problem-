package Recurssion;

public class Reversenumber {
    public static void main(String[] args) {
        System.out.print(reverse(5463));
    }
    public static  int reverse(int n){
        if(n/10==0){
            return n;
        }
        int a = n%10;
        n /=10;
        System.out.print(a);
       return reverse(n);
    }
}
