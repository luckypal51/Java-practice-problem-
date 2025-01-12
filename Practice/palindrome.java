package Practice;

public class palindrome {
   
    public static boolean ispalindrome(String s , int i , int j){
        while(i<j){
            if (s.charAt(i)!= s.charAt(j)) {
               
                return false;
                
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        int max =0; int start =0;int end =0;
        String name = "cbbd";
        int n = name.length();
        for(int i =0;i<n;i++){
            for(int j =i;j<n;j++){
                if (ispalindrome(name,i,j)) {
                    if((j-i+1)>max){
                      max = j-i+1;
                      start =i;
                      end = j;
                     
                    }
                }
            }
        }
        System.out.println(name.substring(start, end+1));
    }
}
