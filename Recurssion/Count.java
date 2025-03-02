package Recurssion;

public class Count {
    public static void main(String[] args) {
      int count =0;
      int n =2002300;
        System.out.println(count(n,count));
    }
    public static int count(int n,int count){
        if(n/10==0){
            return count;
        }
        int s =n%10;
        if(s==0) {
            count++;
        }
        return count(n/10,count);
    }
}
