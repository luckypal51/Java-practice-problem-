package Practice;

import java.util.HashSet;

public class Question7 {
    public static void main(String[] args) {
        String s = " ";
        int n = s.length();
        int start = 0;
        int end =0;
        int maxsum =0;
        HashSet<Character> set = new HashSet<>();
        while (end<n) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                maxsum = Math.max(maxsum, end-start+1);
                end++;
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
            System.out.println(maxsum);
        }
       
    }
}
