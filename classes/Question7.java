package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] alist = new int[a];
        for(int i =0;i<a;i++){
            alist[i] = sc.nextInt();
        }
        int start =0;
        int end = alist.length-1;
        ArrayList<Integer> arr1 = new ArrayList<>();
        while(start< alist.length&&end>0){
            if(alist[start]==alist[end]){
                arr1.add(0);
                start++;
                end--;
            } else if (alist[start]>alist[end]) {
                arr1.add(1);
                end--;
            }
            else{
                arr1.add(2);
                start++;
            }
        }
        System.out.println(arr1);
    }
}
