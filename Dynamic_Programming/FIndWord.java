package Dynamic_Programming;

public class FIndWord {
    public static void main(String[] args) {
        char [][] arr = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        boolean[][]memo = new boolean [arr.length+1][arr[0].length+1];
        System.out.println(check(arr,"","ABCCED",0,0,memo));
    }
    public static Boolean check(char [][] arr, String w,String ans,int row ,int col,boolean [][] memo){
        if(w.length()==ans.length()){
            if(w.equals(ans)){
                return true;
            }else{
                return false;
            }
        }

        boolean re = false;
        if (row < 0 || col < 0 || row >= arr.length || col >= arr.length || memo[row][col]) {
            return false;
        }
            memo[row][col] = true;


        boolean result = check(arr,w+arr[row][col],ans,row+1,col,memo)|| check(arr,w+arr[row][col],ans,row-1,col,memo)|| check(arr,w+arr[row][col],ans,row,col+1,memo)||check(arr,w+arr[row][col],ans,row,col-1,memo);
        memo[row][col] = false;
        return result;
    }
}
