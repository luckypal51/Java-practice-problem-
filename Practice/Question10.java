package Practice;
import java.util.*;;
public class Question10 {
    public static void main(String[] args) {
        int num1[]= {2,3,2};
        int num2[] = {1,2};
        int count1=0;
        int count2 =0;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i =0;i<num1.length;i++){
            set1.add(num1[i]);
        }
        for(int j =0;j<num2.length;j++){
            set2.add(num2[j]);
        }
        for (int num : num2) {
            if (set1.contains(num)) {
                count1++;
            }

        }
        for(int num0:num1){
            if (set2.contains(num0)) {
                count2++;
            }
        }
        int [] arr = {count1,count2};
        System.out.println(Arrays.toString(arr));
    }
}
