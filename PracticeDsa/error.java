package PracticeDsa;

import java.util.Arrays;

public class error {
    public static void main(String[] args) {
       int [] a ={1,2,3};
       int []b ={3,2,1};
       Arrays.sort(b);
        System.out.println(Arrays.equals(a,b));
    }
}
