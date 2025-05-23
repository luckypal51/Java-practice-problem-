package Dynamic_Programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Parenthesis {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("");
        ArrayList<String> arr = new ArrayList<>();
        HashSet<String> set =  gen(8,s);
        System.out.println(set);
        System.out.println(System.currentTimeMillis());
    }
    public static HashSet<String> gen(int n, StringBuilder s){
        HashSet<String> arr = new HashSet<>();
        if(n<=0){
            arr.add(s.toString());
            return arr;
        }
        for(int i = 0;i<=s.length();i+=2){
            for(int j =i;j<=s.length();j+=2){
                StringBuilder a = new StringBuilder(s);
                a.insert(i,"(");
                a.insert(j+1,")");
                arr.addAll(gen(n-1,a));
            }}
        return arr;
    }
}
