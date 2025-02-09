package Recursion;

public class Numberprinter {
    public static void main(String[] args) {
        // write a function to print first five numbers
        Number(110);
    }
    public static void Number(int n ){
        System.out.println(n);
        Number2(++n);

    }
     public static void Number2(int n){
        System.out.println(n);
        Number3(++n);
    }
    public static void Number3(int n){
        System.out.println(n);
        Number4(++n);
    }
    public static void Number4(int n){
        System.out.println(n);
        Number5(++n);
    }
    public static void Number5(int n ){
        System.out.println(n);
        
    }
}
