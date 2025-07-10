package Practice;

import java.util.Locale;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        ;
        System.out.println(n);
        String s = Integer.toBinaryString(n);
        String a = Integer.toHexString(n);
        a=a.toUpperCase();
        System.out.println(a);

        StringBuilder k = new StringBuilder();
        for (int i =0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                k.append('0');
            }else{
                k.append('1');
            }
        }
        System.out.println(k);
        int m = 0;
        int sum =0;
        for (int i=k.length()-1;i>=0;i--){
            if(k.charAt(i)=='1'){
            sum += (int) Math.pow(2,m);
            }
            m++;
        }
        System.out.println(sum);
    }
}
