package Practice;

public class repeatation {
    public static void main(String[] args) {
        String name = "abcabcbb";
        char[] n = name.toCharArray();
        int maxsum = 0;
        int ultimate =0;
        int count =0;
        for(int i =0;i<n.length;i++){
            count =0;
            for(int j = i+1;j<n.length;j++){
                ++count;
               if (n[i]==n[j]) {
                 maxsum = count;
                  break;
               }
              
              
            }
            if (maxsum>ultimate) {
                ultimate=maxsum;
               }
           
        }
        System.out.println(ultimate);
    }
}
