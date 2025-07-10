package Bit_Manupilation;

public class XORTill {
    public static void main(String[] args) {
        System.out.println(xor(5));
        System.out.println(betxor(3,6));
    }
    public static int xor(int n){
// This xor function is working on 0 to n;
        // fn(n) = a^n-1;
        //where a is sumasion of xor
        int i =0;
        if(n%4==0){
            return n;
        } else if (n%4==1) {
            return 1;
        } else if (n%4==2) {
            return n+1;
        }
        return 0;
    }
    public static int betxor(int a , int b){
        int x= xor(a);
        int y = xor(b);
        return x^y;
    }
}
