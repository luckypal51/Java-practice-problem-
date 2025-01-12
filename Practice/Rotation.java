 
package Practice;
import java.util.Arrays;
public class Rotation {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int []arr1= new int[1];
        int rotation = 3;
        int t = 0;
        while(t<rotation){
            for(int i =0;i<arr.length;i++){
                arr1[0] = arr[i];
                arr[i] = arr[arr.length-1];
                arr[arr.length-1]=arr1[0];
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            t++;
        }
       
    }
}
