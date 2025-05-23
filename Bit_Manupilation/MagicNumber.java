package Bit_Manupilation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        int [] arr ={9,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        System.out.println(magicNumberbits(a));
        System.out.println( (int) (Math.log(a)/Math.log(2))+1);
        char s = 'A';
        System.out.println(s-'A');
    }
    public  static  int magicNumber(int sum){
        int count =1;
        int last =0;
        while(sum>=1){
            if(sum%2==1){
                last+=(int) Math.pow( 5, count);
            }
            count++;
            sum/=2;
        }
        return last;
    }
    public  static  int magicNumberbits(int sum){
        int count =1;
        int last =0;
        while(sum>=1){
            if((sum&1)!=0){
                last+=(int) Math.pow( 5, count);
            }
            count++;
            sum = sum>>1;
        }
        return last;
    }



    public static int[] plusOne(int[] digits) {
        int chary =0;
        ArrayList<Integer> arr = new ArrayList<>();
        if(digits[digits.length-1]<9){
            digits[digits.length-1]+=1;
            return digits;
        }else{

            for(int i = digits.length-1;i>=0;i--){
                if(digits[i]>=9&&i==0){
                    arr.add(0);
                    arr.add(1);
                }else if(digits[digits.length-1]>=9&&i == digits.length-1){
                    arr.add(0);
                    chary =1;
                }
                else if(digits[i]>9&&chary!=0){
                    arr.add(0);
                    chary =1;

                }else{
                    arr.add(digits[i]+chary);
                    chary =0;
                }
            }
        }
        int[] num = new int[arr.size()];
        int index = arr.size()-1;
        for(int a :arr){
            num[index--] = a;
        }
        return num;
    }
}
