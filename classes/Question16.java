package classes;

import java.io.IOException;

public class Question16 {
    public static void main(String[] args) throws IOException {
    ProcessBuilder p1 = new ProcessBuilder("notepad.exe");
    p1.start();
int [] arr ={1,0,0,1,0,1};
        System.out.println(check(arr,1,2,arr[0]));

    }
   public static int check(int [] arr , int i , int k, int per){
        if(k==0||i> arr.length-1){
            return i;
        }
        if(per==arr[i]){
            return 0;
        }
        int a = check(arr, i+1, k, per);
        int b = check(arr, i+1, k-1, arr[i]);
        return Math.max(a,b);
   }
}
