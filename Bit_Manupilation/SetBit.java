package Bit_Manupilation;

public class SetBit {
    public static void main(String[] args) {
        System.out.println(reset(11,0));
    }
    public static int set(int a,int i){
        if((a&(1<<i))==0){
            a=a|(1<<i);
        }
        return a;
    }
    public static int reset(int a,int i){
        if((a&(1<<i))!=0){
//            a=a^(1<<i);
            a=a&~(1<<i);
        }
        return a;
    }
}
