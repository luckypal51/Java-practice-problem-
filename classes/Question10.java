package classes;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]  = sc.nextInt();
        }
        int q = sc.nextInt();
        int [] que = new int[q];

        for (int i=0;i<q;i++){
            que[i] = sc.nextInt();
        }
        for(int i =0;i<que.length;i++){
            int sum =0;
            for(int j =0;j< arr.length;j++){
                sum += arr[j];
                if(sum>=que[i]){
                    if(j%2==0){
                        System.out.println("Alice");
                        break;
                    }else{
                        System.out.println("Bod");
                        break;
                    }
                }
            }
        }
    }
}
