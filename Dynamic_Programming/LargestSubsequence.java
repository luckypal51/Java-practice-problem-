package Dynamic_Programming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LargestSubsequence {
    public static void main(String[] args) {
     int [] arr ={50,-75};
     int  k =2;
     int [] ans = new int[k];
        HashMap<String,int[]> map = new HashMap<>();
     Arrays.fill(ans,Integer.MIN_VALUE);
        System.out.println(Arrays.toString(find(0,arr,0,ans,map)));
    }
    public static int[] find(int i,int[]arr,int j,int[]ans,HashMap<String,int[]>memo){
        if (j == ans.length) {
            // base case: valid result (exactly k elements chosen)
            return ans;
        }

        if (i == arr.length) {
            // base case: not enough elements picked
            return null; // invalid subsequence
        }
        String a = i+","+arr[i]+","+j;
        if(memo.containsKey(a)){
            return memo.get(a);
        }
        int []arr0 = find(i+1,arr,j,ans.clone(),memo);
        int [] re = ans.clone();
        re[j] = arr[i];
        int [] arr1 =find(i+1,arr,j+1,re,memo);
        if(arr0==null){
            memo.put(a,arr1);
            return arr1;
        }
        if (arr1==null){
            memo.put(a,arr0);
            return arr0;
        }
          int s1 =0,s2=0;
        for (int k = 0; k < arr0.length; k++) {
            s1+=arr0[k];
            s2+=arr1[k];
        }
       if(s1>s2) {
           memo.put(a, arr0);
           return arr0;
       }
       memo.put(a,arr1);
       return arr1;
    }
}
