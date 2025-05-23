package Practice;

import java.util.Stack;

public class backspace {
    public static void main(String[] args) {
        String s ="ab#c";
        String t ="ad#c";
        System.out.println(backspaceCompare(s,t));
    }
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> ss = new Stack<>();
        Stack<Character> ts = new Stack<>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                ss.pop();
            }else{
                ss.push(s.charAt(i));
            }
        }
        for(int i =0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                ts.pop();
            }else{
                ts.push(t.charAt(i));
            }
        }
        StringBuilder a = new StringBuilder();
        while(!ss.empty()){
            a.append(ss.peek());
            ss.pop();
        }
        StringBuilder b= new StringBuilder();
        while(!ts.empty()){
            b.append(ts.peek());
            ts.pop();
        }
        if(a.reverse().compareTo(b.reverse()) == 0){
            return true;
        }
        return false;
    }
}
