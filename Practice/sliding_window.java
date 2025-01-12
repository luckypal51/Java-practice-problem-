package Practice;

import java.util.*;

public class sliding_window {
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,8,9};
        
        int maxsum =0;
        int n = nums.length;
        int count=0;
        int start =0;
       for(start =0; start<=n-3;start++){
            count =0;
            HashSet<Integer> set = new HashSet<>();
            for(int i =start;i<start+3;i++){
                if(!set.contains(nums[i])){
                    set.add(nums[i]);
                    count += nums[i];
                }
            }
            maxsum = Math.max(maxsum, count);
            start++;
            System.out.println(maxsum);
            }
           
        }
    }

