package Recurssion;

public class FIndSubset {
    public static void main(String[] args) {
          int[] arr ={1,2,3,4};
          String s="";
          subset(arr,0,0,s);
    }
    public static void subset(int[] arr,int i,int j,String s) {
        if(i>=arr.length-1){
            System.out.print(arr[i]+" ");
            return;
        }
        if(j>=arr.length){
            j =i+1;
            s ="";
            subset(arr,j,j,s);
        }else{
            s =s+arr[j];
            System.out.print(s+" ");
            subset(arr, i, j+1, s);
        }
    }
}
