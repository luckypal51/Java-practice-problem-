package Dynamic_Programming;

import java.util.HashMap;

public class Interleaving {
    public static void main(String[] args) {
  String a ="abc", b = "de";
  String ans = "abcde";
        HashMap<String,Boolean> memo = new HashMap<>();
        System.out.println(check(a,b,ans,"",memo));
    }
    public static boolean check(String a, String b, String ans , String result, HashMap<String,Boolean> memo){
        if((a.isEmpty()&&b.isEmpty())){
            if(result.equals(ans)){
                return true;
            }else{
                return false;}
        }
        String re = a + "|" + b + "|" + result;
        if(memo.containsKey(re)){
            return memo.get(re);
        }
        boolean  get= false;
        if(a.isEmpty()){
            String b2 = b.substring(1);
             get = check(a, b2,ans, result+b.charAt(0),memo);

        } else if(b.isEmpty()){
            String a2 = a.substring(1);
            get = check(a2, b,ans, result+a.charAt(0),memo);

        }else {
            String one = a.substring(1);
            String second = b.substring(1);
            get = check(one, second, ans, result + a.charAt(0) + b.charAt(0),memo) || check(one, b, ans, result + a.charAt(0),memo) || check(a, second, ans, result + b.charAt(0),memo);
        }
         memo.put(re,get);
        return memo.get(re);
    }

}
