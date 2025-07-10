package Practice;

public class Reduce1 {
    public static void main(String[] args) {
        System.out.println(chek(51,0));
    }
    public static int chek(int n,int count){
        if(n==1){
            return count+1;
        }
        if(n==2){
            return chek(1,count);
        }
        if(n%2!=0){
            return chek(n-1,count+1);
        }
        int ans = n/2;
        n = n/ans;
       return chek(n,count+1);
    }
}
