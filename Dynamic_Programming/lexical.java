package Dynamic_Programming;

import java.util.HashMap;

public class lexical {
    public static void main(String[] args) {
        String s = "ritz";
        int toRemove = 2;

        // goal: keep originalLength - toRemove characters
        int targetLength = s.length() - toRemove;
        HashMap<String, String> map = new HashMap<>();
        System.out.println(check(toRemove, 0, s, targetLength,map));
    }
    public static String check(int n,int i,String str,int h,HashMap<String,String>map){
        if (n == 0 || i >= str.length()) {
            if (str.length() == h) {
                return str;
            } else {
                return "";  // invalid case
            }
        }
        String key = n + "|" + i + "|" + str;
        if(map.containsKey(key)){
            return map.get(key);
        }
        StringBuilder k = new StringBuilder(str);
        k.deleteCharAt(i);

        String s = check(n-1,i,k.toString(),h,map);
        String t = check(n,i+1,str,h,map);
        if (s.compareTo(t) > 0) {
            map.put(key,s);
            return s;
        } else {
            map.put(key,t);
            return t;
        }
    }
}
