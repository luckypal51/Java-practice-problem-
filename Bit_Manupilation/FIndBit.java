package Bit_Manupilation;

public class FIndBit {
    public static void main(String[] args) {
        System.out.println(find(10,3));
    }
    public static int find(int n,int i){
        if((n&(1<<i))==0){
            return 0;
        }
        return 1;
    }
}
