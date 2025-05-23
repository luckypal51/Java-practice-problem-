package Practice;

public class lessthenk {
    public static void main(String[] args) {
        int [] arr ={2,1,4,3,5};
        System.out.println(countSubarrays(arr,10));
    }
    public static long countSubarrays(int[] nums, long k) {
        int count =0;
        for(int i =0;i<nums.length;i++){
            int sum =0;
            for(int j =i;j<nums.length;j++){
                sum += nums[j];

                if(((long) sum *(j-i+1))<k){
                    count++;
                }else{
                    break;
                }

            }
        }
        return count;
    }
}
