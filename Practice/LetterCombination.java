package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class LetterCombination {
    public static void main(String[] args) {
        System.out.println(19%10);
        System.out.println(19/10);
        int a = (int) Math.sqrt(4);
        System.out.println(a);
        int n =19;
        Stack<Character> stack = new Stack<>();
        stack.push('m');
        System.out.println(stack.peek());
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(get(n,arr));
    }
    public static boolean get(int a,ArrayList<Integer> arr){
        if(a==1){
            return true;
        }
        if(arr.contains(a)){
            return false;
        }else{
            arr.add(a);
        }

        String s = Integer.toString(a);
        int sum =0;
        for(int i =0;i<s.length();i++){
            int num = s.charAt(i)-'0';
            sum += num*num;
        }

        return get(sum,arr);
    }
}
