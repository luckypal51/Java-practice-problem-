package Dynamic_Programming;

import java.util.Arrays;

public class Rob {
    public static void main(String[] args) {
        int [] arr ={1,2,3,1};
        int [] memo =new int [arr.length];
        Arrays.fill(memo,-1);
        System.out.println(check(arr,0,0,memo));
    }
    public static int check(int []nums,int i,int sum, int[]memo){
        if(i> nums.length-1){
            return sum;
        }
        if(memo[i]!=-1){
            return memo[i];
        }
        memo[i] = Math.max(check(nums,i+1,sum,memo),nums[i]+check(nums, i+2, sum,memo));
        return memo[i];
    }
}
