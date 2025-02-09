package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public class Permutation {
    public static void main(String[] args) {
       checkInclusion("ad","hhhshadkkk");
    }
    public static boolean checkInclusion(String s, String a) {
        for(int i=0;i<=a.length()-s.length();i++){
            String ans = a.substring(i,i+s.length());
            if(Arrays.equals(check(s),check(ans))){
                return true;
            }
        }
        return false;
    }
    private static  int[] check(String s){
        int [] arr = new int[26];
        for(int i =0;i<s.length();i++){
            int a = (int)s.charAt(i)-'a';
            arr[a] = arr[a]+1;
        }
        return arr;
    }}
