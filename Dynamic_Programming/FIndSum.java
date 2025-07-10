package Dynamic_Programming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FIndSum {
    public static void main(String[] args) {
     int [] arr ={2,3,6,7};
     String s = "vvvvvvvvvvvvvvvvvvv";
        System.out.println(s.length());
        System.out.println(find(arr,0,new ArrayList<>(),0,7,"",new HashSet<>()));
        
    }
    public static HashSet<List<Integer>> find(int []arr, int cur, ArrayList<Integer>ans,int sum,int limit,String s, HashSet<String>memo){
        HashSet<List<Integer>> result = new HashSet<>();
        if(cur>= arr.length||sum>limit){
            return result;
        }
        if(sum==limit){
            result.add(ans);
            return result;
        }
        String key = cur + "|" + sum + "|" + ans.toString();
        if (memo.contains(key)) return new HashSet<>();
        memo.add(key);

        ArrayList<Integer> a= new ArrayList<>(ans);
        a.add(arr[cur] );

        result.addAll(find(arr, cur+1, a, sum+arr[cur], limit,s,memo));
        result.addAll(find(arr, cur, a, sum+arr[cur], limit,s,memo));
        result.addAll(find(arr, cur+1, ans, sum, limit,s,memo));
       return result;
    }
}
