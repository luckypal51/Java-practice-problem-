package Practice;

import java.util.ArrayList;

public class ThreeDigitEven {
    public static void main(String[] args) {
        int [] arr = {0,5,8,6,1,5,1,2,6,7,6,5,4,3,4,4,2,7,4,2,0,4,7,4
                ,7,6,0,2,5,5,0,5,9,4,0,6,2,3,1,9,7,1,5,5,8,1,1,6,7,6,9
                ,1,1,9,3,9,7,3,2,2,5,0,8,4,0,5,8,4,4,9,2,4,2,4,8,7,3,7,0,
                1,3,4,8,6,6,9,3,5,3,6,6,6,8,6,0,9,8,2,6,8};

        System.out.println(check(arr,"",0,new ArrayList<>()));
    }
    public static ArrayList<Integer> check(int [] arr,String s,int index,ArrayList<Integer> result){
        if(s.length()>2){
            int x = Integer.parseInt(s);
            if(x>99&& x%2==0&&!result.contains(x)){
                result.add(x);
            }
            return result;
        }
        if(index> arr.length-1){
            return result;
        }
        for(int i =0;i<=s.length();i++){
            String K =s.substring(0,i)+arr[index]+s.substring(i);
            check(arr, K, index+1, result);
        }
        return check(arr, s, index+1, result);
    }
}
