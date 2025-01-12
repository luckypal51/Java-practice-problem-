public class maxwealth {
    public static void main(String[] args) {
        
    }
    static int maximumWleath(int[][]arr){
        int max=0;
        for (int person = 0; person < arr.length; person++) {
           
            int sum =0;
            for (int account = 0; account < arr[person].length; account++) {
              
                sum +=arr[person][account];
            }
            if (sum>max) {
                max=sum;

            }
        }
        return max;
    }
}
