package Bit_Manupilation;

public class BaseIntoPower {
    public static void main(String[] args) {
        System.out.println(power(3,6,new int[6+1]));
        System.out.println(powerBit(3,7));
    }
    public static int power(int base, int power, int[] memo){
        if(power==0){
            memo[0] =1;
            return memo[0];
        }
        if(power==1){
            memo[power] = base;
            return base;
        }
        if(memo[power]!=0){
            return memo[power];
        }
        memo[power] = power(base,power-1,memo)*power(base, 1, memo);
        return memo[power];
    }
    public static int powerBit(int base, int power){
        int ans =1;
        while(power>0){
            if((power&1)==1){
                ans*=base;
            }
            base*=base;
            power = power>>1;
        }
        return ans;
    }
}
