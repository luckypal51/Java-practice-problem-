package Recurssion;

public class PatternRecurrsion {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        pattern1(n,n);
//        pattern2(n,1,0);
    }
    public static void pattern1(int n,int m){
        if(n==0){
            return;
        }
        if(m==0){
            System.out.println();
            pattern1(n-1,n-1);

        }else{
            System.out.print(" *");
            pattern1(n,m-1);

        }

    }
    public static void pattern2(int n,int m,int k){
      if(m>n){
          return;
      }
      if(k==m){
          System.out.println();
           pattern2(n,m+1,0);
        }
      else{
          System.out.print(" *");
          pattern2(n,m,k+1);
      }
    }
}
