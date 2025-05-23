package Bit_Manupilation;

public class IsEven {
    public static void main(String[] args) {
        System.out.println(isEven(24));
    }
    public static boolean isEven(int n ){
        if((n&1)==0)
            return true;

        else
            return false;
    }
}
