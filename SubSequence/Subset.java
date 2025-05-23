package SubSequence;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] a ={1,2,2};
        System.out.println(subSeq(a));
    }
    public static ArrayList<List<Integer>> subSeq(int [] a){
        ArrayList<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>());
        for(int i=0;i< a.length;i++){
            int len = arr.size();
           for(int j =0;j< len;j++){
               ArrayList<Integer> arrayList = new ArrayList<>();
               arrayList.addAll(arr.get(j));
               arrayList.add(a[i]);
               arr.add(arrayList);
           }
        }
        return arr;
    }
}
