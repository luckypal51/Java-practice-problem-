package Recurssion;

public class Reversenumber {
    public static void main(String[] args) {
        int size = size(123);
        System.out.println(size);
        System.out.print(reverse(123,size));
//        System.out.println(check(-321));
    }
    public static  int reverse(int n,int size){
        if(n/10==0){
            return n;
        }

        int a = n%10;
        n /=10;

       return (a*size)+reverse(n,size/10);
    }
    private static int size(int n){
        int count =1;
        int i =0;
        n/=10;
        while(i<n){
            count = count*10;
            n/=10;
        }
        return count;
    }
//    private static int check(int x){
//        int sum=0;
//        int i =0;
//        x = Math.abs(x);
//        int size =size(x);
//        while(i<x){
//            int a = x%10;
//            x/=10;
//            sum = sum+size*a;
//            size/=10;
//        }
//        int ans = sum -(2*sum);
//        return ans;
//    }
}
