package PracticeDsa;

import java.util.Arrays;

public class SetMatrix {
    public static void main(String[] args) {
        int [][] arr ={{1,2},{0,3}};
        System.out.println(Arrays.deepToString(setzero(arr)));
    }
    public static int [][] setzero(int [][]arr){
        int r = arr.length;
        int c = arr[0].length;
        boolean [] row = new boolean[r];
        boolean [] col = new boolean[c];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                if(arr[i][j]==0){
                    row[i] =true;
                    col[j] =true;
                }
            }}
        for(int i =0;i< arr.length;i++){
            if (row[i]){
                for (int j = 0; j < arr[0].length ; j++) {
                    arr[i][j] =0;

                }
            }
        }
        for(int i =0;i< arr[0].length;i++){
            if (col[i]){
                for (int j = 0; j < arr.length ; j++) {
                    arr[j][i] =0;

                }
            }}
        return arr;
    }
}
