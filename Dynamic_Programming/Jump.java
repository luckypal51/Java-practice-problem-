package Dynamic_Programming;

import java.util.ArrayList;

public class Jump {
    public static void main(String[] args) {
    int [] arr = {5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5};
        System.out.println(jump(arr,0,0));
        int [][] mat = {{1,0,0,1,0},{0,0,1,0,1},{0,0,0,1,0},{1,0,1,0,1}};
        System.out.println(ValidCorner(mat));
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
    public static boolean ValidCorner(int mat[][]) {

        for(int i =0;i<mat.length-1;i++){
            for(int j =i+1;j<mat.length;j++){
                int count =0;

                for(int k =0;k<mat[0].length;k++){
                    if(mat[i][k]==1&&mat[j][k]==1){
                        count++;
                    }
                }
                if(count>=2){
                    return true;
                }
            }
        }
        return false;
    }
}
