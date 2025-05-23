package classes;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
         int n =5;
         int m=4;
         int arr[]={1,4,2,3,5};
         int [][] jm ={{0,5},{8,20},{3,3},{2,9}};
        System.out.println(Arrays.toString(Jump(n,m,arr,jm)));
    }
    public static int[] Jump(int n, int m, int [] arr,int [][]jm){
        int [] a= new int[n];
        for(int i =0;i< arr.length;i++){
            int current =0;
            for(int j=0;j<jm.length;j++){
                if(arr[i]>=jm[j][0]){
                    current += jm[j][1];
                }
            }
            a[i]  = current;
        }
        return a;
    }
}
