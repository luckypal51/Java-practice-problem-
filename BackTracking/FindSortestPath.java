package BackTracking;

import BinarySearch.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindSortestPath {
    public static void main(String[] args) {
        int[][] a = {{0,0,0},{0,0,0},{0,0,0}};
        boolean[][] b = new boolean[3][3];
        System.out.println(obstakle(a,0,0));
        System.out.println(path(a,0,0,""));
        System.out.println(alldirection(a,0,0,b));
        System.out.println(Arrays.toString(b));


    }
    public static ArrayList<String> path(int [][]arr, int row, int cloum, String s){
        ArrayList<String> a = new ArrayList<>();
        if(row==arr.length-1&&cloum== arr[0].length-1){
           a.add(s);
            return a;
        }

        if(row==arr.length-1){
            String b = s+"R";
           return path(arr,row,cloum+1,b);
        }
        if(cloum== arr[0].length-1){
            String b = s+"D";
            return path(arr, row+1, cloum,b);
        }
        String r = s+"R";
        String d = s+"D";
        a.addAll(path(arr,row+1,cloum+1,s+"T"));
       a.addAll(path(arr, row+1, cloum,d));
        a.addAll(path(arr, row, cloum+1,r));
        return a;
    }
    public static int obstakle(int[][] arr, int row , int cloumn) {
        if (arr[row][cloumn] == -1) {
            return 0;
        }
        if (row == arr.length - 1 && cloumn == arr[0].length - 1) {
            return 1;
        }

        if(row==arr.length-1){
            return obstakle(arr, row, cloumn+1);
        }
        if(cloumn==arr[0].length-1){
            return obstakle(arr,row+1,cloumn);
        }
        return obstakle(arr, row+1,cloumn)+obstakle(arr, row, cloumn+1);
    }
    public static int alldirection(int [][] arr, int row , int cloumn, boolean [][] memo){
        if(row == arr.length-1&& cloumn == arr[0].length-1){
            return 1;
        }


        if (row < 0 || cloumn < 0 || row >= arr.length || cloumn >= arr[0].length || memo[row][cloumn]) {
            return 0;
        }

        memo[row][cloumn]= true;
            int a = alldirection(arr,row-1,cloumn,memo)+ alldirection(arr, row, cloumn-1, memo)+alldirection(arr, row, cloumn+1, memo)+alldirection(arr, row+1, cloumn, memo);
        memo[row][cloumn] = false;
            return a;
    }

}
