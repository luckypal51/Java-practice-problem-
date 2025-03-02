package Recurssion;
import java.util.HashMap;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 14;
        int count =0;
        System.out.println(climb(n,count));
        int ans =(climbStairs(n));
        System.out.println(ans);
    }

    public static int climbStairs(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return climb(n, memo);
    }

    private static int climb(int n, HashMap<Integer, Integer> memo) {
        if (n <= 2) return n;  // Base cases: 1 step → 1 way, 2 steps → 2 ways
        if (memo.containsKey(n)) return memo.get(n);  // Use memoized result

        int result = climb(n - 1, memo) + climb(n - 2, memo);  // Recursive step
        memo.put(n, result);  // Store result in memo for future use
        return result;
    }
    public static int climb(int n,int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            n /=2;
            return climb(n,count+1);
        }
        return climb(n-1,count+1);
    }
}
