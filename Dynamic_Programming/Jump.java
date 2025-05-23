package Dynamic_Programming;

import java.util.ArrayList;

public class Jump {
    public static void main(String[] args) {
    int [] arr = {5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5};
        System.out.println(jump(arr,0,0));
    }
    public static ArrayList<Integer> jump(int [] arr, int index,int jump){
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(index==arr.length-1){
            arrayList.add(jump);
            return arrayList;
        }
        if(index>arr.length-1|| index<0||arr[index]==0){
            return arrayList;
        }
        for(int i = 1;i<=arr[index];i++){

                arrayList.addAll(jump(arr,i+index,jump+1));

        }
        return arrayList;
    }
}
