package PracticalTest;

public class Question7 {
    public static void main(String[] args) {
        int [][] a={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(path(a,0,0));
    }
    public static int path(int[][] arr,int i, int j){
        if(i== arr.length-1&&j== arr.length-1){
            return 1;
        }
        if(i> arr.length-1||j> arr.length-1||arr[i][j]==1){
            return 0;
        }
        return path(arr, i+1, j)+path(arr, i, j+1);
    }
}
