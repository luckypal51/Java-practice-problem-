public class minimum {
    //finding the minimun number in the array
    public static void main(String[] args) {
        int []arr ={1,2,5,3,45,8,9};
        System.out.println(mini(arr));
    }
    static int mini(int[]arr){
        if (arr.length==0) {
            return -1;
        }
        
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
            int min =arr[0];
            if(arr[i]>arr[j]){
             min=arr[j];
             return min;
            }}
        }
        return -1;
    }
}
