package Practice;

public class string_rotation {
    public static void main(String[] args) {
        String s ="abcde";
        String goal =  "cdeab";
        System.out.println(rotateString(s, goal));
    }
    public static boolean rotateString(String s, String goal) {
        char a = 'a';
       StringBuilder sb = new StringBuilder(s);
      for(int i =0;i<s.length()-1;i++){
         int index1 = 0;
         int index2 = s.length()-1;
        for(int j=0;j<s.length()-1;j++){
            char temp = sb.charAt(index1);
            sb.setCharAt(index1, sb.charAt(index2));
            sb.setCharAt(index2, temp);
            index1++;
             if(sb.toString().equals(goal)){
                return true;
            }
         
        }
       
      }
      return false;
    }
}
