package Permutation;

import java.util.HashMap;

public class example {
    public static void main(String[] args) {
        int[][] keypad ={{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
        int sum=0;
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i<keypad.length; i++) {
            for(int j =0;j<keypad[0].length;j++){
                if(keypad[i][j]!=-1){
                sum+=key(2-1, keypad, i, j,map);
                }
            }
        }
        System.out.println(sum);
    }
    public static int key(int n,int [][]keypad,int i,int j,HashMap<String,Integer>map){
        if(i>=keypad.length||j>=keypad[0].length||i<0||j<0){
         return 0;
        }
        String key  = n+","+i+","+j;
        if(map.containsKey(key)){
            return map.get(key);
        }
        if(keypad[i][j]==-1){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int re =0;
        re += key(n - 1, keypad, i, j,map);
        re+=key(n-1, keypad, i+1, j,map);
        re+=key(n-1, keypad, i-1, j,map);
        re+=key(n-1, keypad, i, j+1,map) ;
        re+=key(n-1, keypad, i, j-1,map);
        map.put(key,re);

        return re;
    }
}
