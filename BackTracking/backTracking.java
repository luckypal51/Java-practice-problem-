package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class backTracking {
    public static void main(String[] args) {
       int [][] arr = {{0,0,0},{0,0,0},{0,0,0}};
       boolean[][] memo = new boolean[arr.length][arr.length];
        System.out.println(back(arr,0,0,"",memo));
    }
    public static ArrayList<String> back(int [][]arr, int row , int column, String s, boolean[][] memo ){
        ArrayList<String> result = new ArrayList<>();
        if(row==arr.length-1&&column==arr[0].length-1){
            result.add(s);
            return  result;
        }
        if(row>= arr.length||column>= arr[0].length||row<0||column<0||memo[row][column]){
            return result;
        }
        memo[row][column] = true;
        String u = s+"U";
        String d = s+"D";
        String r = s+"R";
        String l = s+"L";
       result.addAll(back(arr, row-1, column, u, memo));
        result.addAll(back(arr, row+1, column, d, memo));
       result.addAll( back(arr, row, column-1, l, memo));
        result.addAll(back(arr, row, column+1, r, memo));

        memo[row][column] = false;
        return result;
    }
}
