package Bit_Manupilation;

public class Repeating3 {
    public static void main(String[] args) {
        int [] arr ={2,2,3,2,7,7,8,8,8,7};
        int ones =0;
        int twos =0;
        for(int num : arr){
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        System.out.println(ones);
        System.out.println();
    }
}
