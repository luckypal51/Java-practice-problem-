package PracticalTest;

public class Question4 {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int ans =0;
        for (int i = 0; i < arr[0].length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                ans +=arr[i][j];
            }
        }
        int n = arr.length* arr[0].length;
        int aver = ans/n;
        System.out.println(aver);
    }
}
