package Bit_Manupilation;

public class Power2 {
    public static void main(String[] args) {
        System.out.println(check(32));

        System.out.println(273%11);
        int a = (int) Math.sqrt(8);
        System.out.println(a);
    }
    public static boolean check(int a){
        int count =0;
        while(a>0){
            count += a&1;
            a=a>>2;
        }
        if(count>1){
            return false;
        }
        return true;
    }
}
