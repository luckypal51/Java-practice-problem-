import java.util.Arrays;

public class searchin2Darray {

public static void main(String[] args) {
    int[][]arr = {{24,8,1},{10,9,5,6},{12,54,65,64},{17,15,16}};
    int target = 54;
    int[] ans =search2(arr, target);
    System.out.println(Arrays.toString(ans));
}
static int[] search2(int[][]arr,int target) {
for (int row = 0; row < arr.length; row++) {
    for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col]==target) {
            return new int[]{row,col};
        }
    }

}
return new int[]{-1,-1};
    
}
}