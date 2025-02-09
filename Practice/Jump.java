package Practice;

import java.util.Arrays;

public class Jump {
             public static void main(String[] args) {
                System.out.println(canReach("01101110", 2, 3));
              String b ="name";

             }
        public static boolean canReach(String s, int minJump, int maxJump) {
            int n = s.length();
            if (s.charAt(n - 1) != '0') return false;
    
            boolean[] dp = new boolean[n];
            dp[0] = true; // Start position is always reachable
            int reachableCount = 0; // Sliding window sum to track valid jumps
    
            for (int i = 1; i < n; i++) {
                if (i >= minJump) {
                    reachableCount += dp[i - minJump] ? 1 : 0;
                }
                if (i > maxJump) {
                    reachableCount -= dp[i - maxJump - 1] ? 1 : 0;
                }
    
                // This index is reachable if it's '0' and there was at least one reachable position
                if (s.charAt(i) == '0' && reachableCount > 0) {
                    dp[i] = true;
                }
                System.out.println(i+" "+reachableCount);
            }
           
            System.out.println(Arrays.toString(dp));
            
            return dp[n - 1];
        }
    }

