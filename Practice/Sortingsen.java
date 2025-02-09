package Practice;

import java.util.Arrays;

public class Sortingsen {
    public static void main(String[] args) {
        String s ="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
       
    }
    public static String sortSentence(String s) {
        String[]arr = s.split(" ");
        String[]ans = new String[arr.length];
       
        for(int i =0;i<arr.length;i++){
          int index = arr[i].charAt(arr[i].length()-1)-'0';
          StringBuilder str = new StringBuilder(arr[i]);
          ans[index-1] = str.substring(0,arr[i].length()-1);
        }
         String a = ans[0];
        for(int i =1;i<ans.length;i++){
           a = a+" "+ans[i];
        }
        return a;
      }
}
