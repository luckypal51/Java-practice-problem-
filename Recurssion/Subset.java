package Recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Subset {
    public static void main(String[] args) {
        String s ="abcdefg";
        ArrayList<String> a= subset(s,"");
        System.out.println(a);
        System.out.println( ASCII("abc",""));


    }
    public static ArrayList subset(String s, String ans){
        ArrayList<String> a = new ArrayList<>();
        if(s.isEmpty()){
            a.add(ans);
            return a;
        }
        char ch =s.charAt(0);
// .addAll function is used to add all the perivoius answer into the current function arrayList
        a.addAll(subset(s.substring(1),ans+ch)) ;

        a.addAll(subset(s.substring(1),ans));
          return a;

    }
    public static ArrayList<String> ASCII(String a, String ans){
        ArrayList<String> set = new ArrayList<>();
        if(a.isEmpty()){
            set.add(ans);
            return set;
        }
        char ch = a.charAt(0);
        int ab =(int) ch;
        set.addAll(ASCII(a.substring(1),ans+ch));
        set.addAll(ASCII(a.substring(1),ans+ab));
        set.addAll(ASCII(a.substring(1),ans));
        return set;
    }
}
