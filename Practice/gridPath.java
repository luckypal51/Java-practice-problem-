package Practice;

import java.util.ArrayList;
import java.util.List;

public class gridPath {
    public static void main(String[] args) {
      int [] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }

        public static List<String> summaryRanges(int[] nums) {
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<String> result = new ArrayList<>();
            arr.add(nums[0]);
            for(int i =1;i<nums.length;i++){
                if(nums[i]+arr.get(arr.size()-1)==1){
                    arr.add(nums[i]);
                }else{
                    if(arr.size()>1){
                        String a = arr.get(0)+"->"+arr.get(arr.size()-1);
                        result.add(a);
                    }else{
                        result.add(""+arr.get(0));
                    }
                    arr.clear();
                    arr.add(nums[i]);
                }
            }
            return result;
        }
}
