package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
	 for(int j =0;j<T;j++){
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean ans = check(arr,new ArrayList<>(),new ArrayList<>(),0);
        if(ans){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
public static boolean check(int[]arr,ArrayList<Integer> p, ArrayList<Integer> q,int i){
    if(i>=arr.length){
        return concat(arr,p,q);
    }
    ArrayList<Integer> a = new ArrayList<>(p);
    ArrayList<Integer> b = new ArrayList<>(q);
    a.add(arr[i]);
    b.add(arr[i]);
    return check(arr,a,q,i+1)||check(arr,p,b,i+1);
}
public static boolean concat(int []arr,ArrayList<Integer> p,ArrayList<Integer>q){
    int start =0;
    Arrays.sort(arr);
    int [] result = new int [arr.length];
    if(p.size()==0){
        for(int i =0;i<q.size();i++){
            result[i] = q.get(i);
        }
    }
    else if(q.size()==0){
        for(int i =0;i<p.size();i++){
            result[i] = p.get(i);
        }
    }
    else if(p.get(0)<q.get(0)){
        while(start<arr.length){
            if(start<p.size()){
                result[start]= p.get(start);
            }else{
                int i = start-p.size();
                result[i] = q.get(i);
            }
            start++;
        }
    }else{
        while(start<arr.length){
            if(start<q.size()){
                result[start]= q.get(start);
            }else{
                int i = start-q.size();
                result[i] = p.get(i);
            }
            start++;
        }
    }
    for(int i =0;i<arr.length;i++){
        if(arr[i]!=result[i]){
            return false;
        }
    }
    return true;
}
}
