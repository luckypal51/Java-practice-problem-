package Bit_Manupilation;

public class SingleNumber {
    public static void main(String[] args) {
    int[] a= {1,2,3,3,2,1,5};
        System.out.println(find(a));

    }
    public static int find(int[]arr){
       int ans =0;
       for(int n :arr){
           ans^=n;
       }
       return ans;
    }
}
