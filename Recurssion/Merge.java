package Recurssion;

import java.util.Arrays;
// time complexicity == (nlogn)
// Space complexicity == (On)
public class Merge {
    public static void main(String[] args) {
        int [] arr ={1,5,2};
        System.out.println(Arrays.toString(merge(arr,0, arr.length-1)));
    }
    public static int[] merge(int[]arr,int s,int e){
        if(s>=e){
            return new int[]{arr[s]};
        }
        int mid = s+(e-s)/2;
        int [] arr1 = merge(arr,s,mid);
        int [] arr2 = merge(arr,mid+1,e);
        int [] arr3 = new int[arr1.length+ arr2.length];
        return sort(arr1,0,arr2,0,arr3,0);
    }
    public static  int[] sort(int[] arr1,int i,int [] arr2,int j,int[] arr,int k){
        if(k>=arr.length){
            return arr;
        }
        if (i< arr1.length && j< arr2.length){
            if (arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                return sort(arr1, i+1, arr2, j, arr, k+1);
            }else{
                arr[k] = arr2[j];
                return  sort(arr1, i, arr2, j+1, arr, k+1);
            }
        }else{
            if(i< arr1.length){
                arr[k] = arr1[i];
                return sort(arr1, i+1, arr2, j, arr, k+1);
            }
            if (j< arr2.length){
                arr[k] = arr2[j];
                return  sort(arr1, i, arr2, j+1, arr, k+1);
            }
        }
        return new int[] {Integer.parseInt(null)};
    }
}
