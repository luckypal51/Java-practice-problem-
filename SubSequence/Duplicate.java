package SubSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Duplicate {
    public static void main(String[] args) {
   int [] arr={1,2,2};
        System.out.println(subSet(arr));
    }
    public static ArrayList<List<Integer>> duplicateSub(int [] arr){// time complexicity O(N^3)
        ArrayList<List<Integer>> arrayList = new ArrayList<>();
        arrayList.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            int len = arrayList.size();
            for(int j=0;j<len;j++){
                ArrayList<Integer> list = new ArrayList<>(arrayList.get(j));
                list.add(arr[i] );
                int count =0;
                for(int k =0;k< arrayList.size();k++){
                    if(list.equals(arrayList.get(k))){
                        count++;
                    }
                }
                if(count==0){
                    arrayList.add(list);
                }

            }
        }
        return arrayList;
    }
    public static ArrayList<List<Integer>> subseq(int [] arr){// time complexicity O(N^2)
        ArrayList<List<Integer>> sub = new ArrayList<>();
        HashSet<List<Integer>> uniqueset = new HashSet<>();
        sub.add(new ArrayList<>());
        for(int i=0;i< arr.length;i++){
            int slen = sub.size();
            for(int j =0;j<slen;j++){
                ArrayList<Integer> list = new ArrayList<>();
                list.addAll(sub.get(j));
                list.add(arr[i]);

                if(uniqueset.add(list)){
                    sub.add(list);
                }
            }
        }
        return sub;
    }
    public static ArrayList<List<Integer>> subSet(int [] arr){
        Arrays.sort(arr);
        ArrayList<List<Integer>>arrayList = new ArrayList<>();
        int pre =0;
        int pl =0;
        int endindex =0;
        int start =0;

        arrayList.add(new ArrayList<>());
        for(int i =0;i< arr.length;i++){
            int len = arrayList.size();

            if(i>0&&arr[i]==arr[i-1]){
                start = endindex;
            }
            else {
                start=0;

            }
            endindex= len;
            for (int j = start; j <len ; j++) {
                ArrayList<Integer> list = new ArrayList<>();

                      list.addAll(arrayList.get(j));
                      list.add(arr[i]);
                      arrayList.add(list);


            }
        }
        return arrayList;
    }
}
