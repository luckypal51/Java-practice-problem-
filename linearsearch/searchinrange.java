public class searchinrange {
    public static void main(String[] args) {
        //linear search in array 9in range 
        int[]arr = {10,20,30,40,50,110,220};
        int start =1;
        int end = 4;
        int target =40;
        System.out.println(Linearsearch( start, end,target,arr));
    }
    static int Linearsearch(int start,int end, int target,int[]arr){
        if(arr.length==0){
            return -1;
    }
    for(int i=start;i<=end;i++){
        if (target==arr[i]) {
            return i;
        }
    }
    return -1;
    }}
