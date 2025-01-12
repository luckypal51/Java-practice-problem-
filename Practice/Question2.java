package Practice;

/**
 * Question2
 */
public class Question2 {

    public static void main(String[] args) {
        int []arr ={-2,1,-3,4,-1,2,1,-5,4};
    
        int maxsum= 0 ;
        for(int i = 0;i<arr.length;i++){
            int temp =0;
            for(int j = i;j<arr.length;j++){
               
                 temp += arr[j];
                 if (temp>maxsum) {
                    maxsum = temp;
                }
            }
            
        }
        System.out.println(maxsum);
    }
}