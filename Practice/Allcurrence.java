package Practice;

import java.util.*;

public class Allcurrence {
    public static void main(String[] args) {
        String s = "zznjmunznjmznjmuujmuznjmuznznznjmujmujznznjmujznjmznjmuznjznjmuznjmumuuznjmumumuzznjznjmumunznjmznjmuujmuznjznjmznjmuumugsfxoppfdxh";
        String part ="znjmu";
        System.out.println(getString(s,part));
        int[] arr ={1,2};
        System.out.println(majorityElement(arr));
    }
    public static String getString(String s,String part){
        StringBuilder str = new StringBuilder();
        for(int i =0;i<s.length()-part.length();i++){
            String ans = s.substring(i,i+part.length());
            if(part.equals(ans)){
                s= s.replace(part,"");
                if(i>=part.length()){
                    i=i-part.length();
                }
                else{
                    i=0;
                }

            }


        }
        for(int i =0;i<s.length()-part.length();i++){
            String ans = s.substring(i,i+part.length());
            if(part.equals(ans)){
                s= s.replace(part,"");
                if(i>=part.length()){
                    i=i-part.length();
                }
                else{
                    i=0;
                }

            }


        }
        s = s.replace(part,"");
        return s;
    }
    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int an:nums){
            if(map.containsKey(an)){
                int value = map.get(an);
                map.put(an,value+1);
            }
            else{
                map.put(an,1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int max =0;
        for(Map.Entry<Integer,Integer> ans:map.entrySet()){
            System.out.println(ans);
            int current = ans.getValue();
            if(current>max){
                max = current;
                arr.clear();
                arr.add(ans.getKey());
            }
            else if(current==max){
                arr.add(ans.getKey());
            }

        }
        return arr;
    }
}
