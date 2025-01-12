package Practice;

import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {
        int []arr ={1,0,2,0,3,4};
        int temp =0;
        for(int i =0;i<arr.length;i++){
            if (arr[i]==0) {
                temp = arr[i];
                for(int j =i+1;j<arr.length;j++){
                    arr[i] = arr[i+1];
                }
                arr[arr.length-1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
