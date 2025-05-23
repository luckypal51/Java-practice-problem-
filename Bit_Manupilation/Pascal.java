package Bit_Manupilation;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public static void main(String[] args) {
        pascal(5);
    }
    public static void pascal(int a){
        ArrayList<List<Integer>> arrayList = new ArrayList<>();
        for(int i = 0; i<a; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <=i ; j++) {
                 if(j==0||j==i){
                     row.add(1);
                 }else{
                     // perivious row's current-1 element and current element
                     int ans = arrayList.get(i-1).get(j-1)+ arrayList.get(i-1).get(j);
                     row.add(ans);
                 }
            }
            arrayList.add(row);
        }
        for(List<Integer> b:arrayList){
            System.out.println(b);
        }
    }
}
