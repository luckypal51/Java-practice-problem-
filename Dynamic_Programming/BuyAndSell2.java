package Dynamic_Programming;

import java.util.HashMap;

public class BuyAndSell2 {
    public static void main(String[] args) {
         int [] a = {7,1,5,3,6,4};

        HashMap<String,Integer> memo = new HashMap<>();
        System.out.println(stock(a,true,0,0,memo));

    }
   public  static  int stock(int []arr, boolean canbuy, int i, int cur,HashMap<String,Integer> map){
        if(i>=arr.length){
            return 0;
        }
       String a = "";
        if(canbuy){
            a =i+"-"+canbuy;
        }else{
            a = i+"-"+canbuy+"-"+cur;
        }
        if(map.containsKey(a)){
            return map.get(a);
        }
        int n ;
        if(canbuy){
             n  =Math.max(stock(arr,false, i+1,arr[i],map),stock(arr, true, i+1, cur,map));

        }else {


            int k = arr[i] - cur;
             n = Math.max(k + stock(arr, true, i + 1, cur, map), stock(arr, false, i + 1, cur, map));


        }

       map.put(a, n);
        return n;
   }

}