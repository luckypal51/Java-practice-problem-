package Recurssion;

public class Sumdig {
    public static void main(String[] args) {
        System.out.println(find(12345));
    }
    public static int find(int n){
        if(n==0){
            return 0;
        }
        int k =n%10;
         n =n/10;
         return k+find(n);
    }
}
