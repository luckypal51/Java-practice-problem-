package Dynamic_Programming;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximunSum {
    public static void main(String[] args) {
          int [] arr ={1,2,3,6};
        Arrays.sort(arr);
        System.out.println(check(arr,0,new ArrayList<>()).reversed());
    }
    public static ArrayList<Integer> check(int [] arr,int cur,ArrayList<Integer> result) {
        if(cur>=arr.length-1){
            return result;
        }
        ArrayList<Integer> a = check(arr, cur+1,new ArrayList<>(result));
        ArrayList<Integer> b = new ArrayList<>();
       if(result.isEmpty()){
           result.add(arr[cur]);
           b.addAll(check(arr, cur+1, result));
       }else{
           if((result.get(result.size())%arr[cur])==0){
               result.add(arr[cur]);
               b.addAll(check(arr, cur+1, result));
           }
       }
       if(a.size()> b.size()){
           return a;
       } else if (a.size()==b.size()) {
           int sum1 =0,sum2=0;
           for(int i =0;i< a.size();i++){
               sum1+=a.get(i);
               sum2+=b.get(i);
           }
           if(sum1>sum2){
               return a;
           }else{
               return b;
           }
       }
       return b;
    }
}
