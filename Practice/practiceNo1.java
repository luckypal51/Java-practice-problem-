package Practice;

public class practiceNo1 {
    public static void main(String[] args) {
        int [] arr ={-1,-4,-1,4};
        System.out.println(countSubarrays(arr));
    }
    public static int countSubarrays(int[] nums) {
        int count =0;
        for(int i =0;i<nums.length-2;i++){
            float sum =nums[i]+nums[i+2];
            float half =(nums[i+1]/2f);
            if(sum==half){
                count++;
            }
        }
        return count;
    }
}
