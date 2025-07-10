package classes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

public class QuestionClass {
    public static void main(String[] args) {
        System.out.println(encrypt("abcda"));
        System.out.println(substrCount("abbc",2));
        Vector<Integer> vec = new Vector<>();
        vec.add(1);
        vec.add(2);
        System.out.println(vec);
    }
    public static String encrypt(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i:s.toCharArray()){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        String result ="";
        for(char a: s.toCharArray()){
            int x= a-96;
            if(map.get(a)%2==0){

                if(x+3>26){
                    x= (x+3)-26;
                    char k = (char)(x+96);
                    result +=""+k;
                }else{
                    x+=3;
                    char k = (char)(x+96);
                    result +=""+k;
                }
            }else{
                if(x-3<=0){
                    x= 26-(Math.abs(x-3));
                    char k = (char)(x+96);
                    result +=""+k;
                }else{
                    x-=3;
                    char k = (char)(x+96);
                    result +=""+k;
                }
            }
        }
        return result;
    }
    public static int substrCount(String s, int k) {
        // code here
        int sum =0;
        for(int i =0;i<=s.length()-k;i++){
            int count =1;
            HashSet<Character> set = new HashSet<>();
            for (int j = i ; j < i + k; j++) {
                set.add(s.charAt(j));
            }
            if(set.size()==k-1){
                sum++;
            }
        }
        return sum;
    }
}
