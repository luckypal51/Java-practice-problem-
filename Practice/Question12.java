package Practice;

import java.util.Arrays;
import java.util.TreeSet;

public class Question12 {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3,3};
        
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int k =0;
        for (int  unique : set) {
            nums[k++] = unique;

        }
        System.out.println(set.size()+" "+Arrays.toString(nums));
    }
}
