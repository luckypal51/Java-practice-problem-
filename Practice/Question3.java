package Practice;

public class Question3 {
    public static void main(String[] args) {
        int []arr = {1,2,3,5,4,6,7,9};
        int n= arr.length+1;
        int temp =0;
        int sum = n*(n+1)/2;
        System.out.println(sum);
        for(int i = 0;i<arr.length;i++){
            temp += arr[i];
        }
        System.out.println(temp);
        int value = sum-temp;
        System.out.println(value);
    }
}
