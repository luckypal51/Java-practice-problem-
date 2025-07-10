package Practice;

public class MaxProduct {
    public static void main(String[] args) {
        int [] arr = {2,3,-1,4,-5};
        int max =arr[0];
        int result =arr[0];
        int min = arr[0];
        int current = arr[0];
        for(int i =1;i<arr.length;i++){
            current=arr[i];
            if(current<0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(current,max*current);
            min = Math.min(current, min*current);
            result = Math.max(result, max);


        }
        System.out.println(result);    }

}
