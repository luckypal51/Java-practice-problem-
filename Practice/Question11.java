package Practice;

public class Question11 {
    public static void main(String[] args) {
        String s = " ";
        String n = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = n.length();
        int i = 0;
        if (n.length()==0) {
            System.out.println(true);
        }
        while(i<l){
            if (n.charAt(i)!=n.charAt(l)) {
                System.out.println("false");
            }
            else{
                System.out.println("true");
            }
        }
    }
}
