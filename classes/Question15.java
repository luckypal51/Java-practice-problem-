package classes;

public class Question15 {
    public static void main(String[] args) {
        String s ="";

        System.out.println(check("abcb",0,0,"bdcab",""));
    }
    public static String check(String s,int i,int j,String m,String up){
        if(i>s.length()-1||j>m.length()-1){
           return up;
        }
        
        String k ="";
        if (s.charAt(i)==m.charAt(j)){
            String newUp = up + s.charAt(i);
            k = check(s, i+1, j+1, m, newUp);
        }
        String a = check(s, i+1, j, m,up);
        String b = check(s, i, j+1, m, up);
        if(a.length() > b.length()){
            if(a.length() > k.length()){
                return a;
            } else{
                return k;
            }
        } else {
            if(b.length() > k.length()){
                return b;
            } else{
                return k;
            }}
    }
}
