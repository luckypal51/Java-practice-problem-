package Dynamic_Programming;

public class UniquePath {
    public static void main(String[] args) {
        Integer [][] arr = new Integer [3][3];
        System.out.println(unique(3-1,3-1,0,arr));
    }
    public static int unique(int m, int n, int sum, Integer [][]arr){
        if(m==0&& n==0){

            return 1;
        }
        if(m<0||n<0){
            return 0;


        }if (arr[m][n] != null) {
            return arr[m][n];  // Return memoized result
        }


        arr[m][n]= unique(m-1,n,sum,arr) +unique(m,n-1,sum,arr);
        return arr[m][n];
    }
}
