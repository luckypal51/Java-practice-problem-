package Practice;

public class Lookalike {
    public static void main(String[] args) {
        String s ="book";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        s.toLowerCase();
        int count1 =0;
        int count2 =0;
        char [] arr = {'a','e','i','o','u','A', 'E', 'I', 'O', 'U'};
        StringBuilder str = new StringBuilder(s);
        String a = str.substring(0,(s.length()/2));
        String b = str.substring((s.length()/2),s.length());
        System.out.println(a+" "+b);
        for(int i=0;i<a.length();i++){
            for(int j =0;j<arr.length;j++){
                if(a.charAt(i)==arr[j]){
                    count1++;
                }
            }
        }
         for(int i=0;i<b.length();i++){
            for(int j =0;j<arr.length;j++){
                if(b.charAt(i)==arr[j]){
                    count2++;
                }
            }
        }
        if(count1==count2){
            return true;
        }
        return false;
    }
}
