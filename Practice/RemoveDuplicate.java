package Practice;

import java.util.Stack;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println(remove("cbacdcbc"));
        if('d'>'b'){
            System.out.println("yohoooo");
        }
    }
    public static String remove(String s){
        int[] lastindex = new int[26];
        boolean[] seen = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<s.length();i++){
            lastindex[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(seen[c-'a']) continue;
            System.out.println(stack);
            while(!stack.isEmpty()&&c<stack.peek()&&i<lastindex[stack.peek()-'a']){

                seen[stack.pop()-'a']=false;
            }
            stack.push(c);
            seen[c-'a'] = true;
        }
        StringBuilder str = new StringBuilder();
        for(char k : stack){
            str.append(k);
        }
        return str.toString();
    }
}
