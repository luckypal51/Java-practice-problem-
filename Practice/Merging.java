package Practice;

import java.util.Arrays;

public class Merging {
    public static void main(String[] args) {
        
        int [] arr1 ={0,2,4};
        int [] arr2 ={1,3,6,8,9};
        int n= arr1.length-1;
        int m= arr2.length-1;
        int arr[]= new int[n+m];
        int left =0;
        int rigth =0;
        int index=0;
        while (left<n&&rigth<m) {
            if (arr1[left]<=arr2[rigth]) {
                arr[index] = arr1[left++];
                index++;
               }
            if (arr2[rigth]<=arr1[left]) {
                arr[index] = arr2[rigth++];
                index++;
                
            }
            
        }
        while (left<n) {
            arr[index++] = arr1[left++];    
        } 
        while(rigth<m){
            arr[index++] = arr2[rigth++];
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <n+m; i++) {
            if (i<n) {
              arr1[i] = arr[i]; 
            }
            else{
                arr2[i-n] =arr[i];
            }
        }
        System.out.print(Arrays.toString(arr1));
        System.out.print(Arrays.toString(arr2));

    }
}
