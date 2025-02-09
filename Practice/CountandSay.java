package Practice;

public class CountandSay {
    public static void main(String[] args) {

        System.out.println(countAndSay(4));
    }

        public static String countAndSay(int n) {

            String k ="";
            String s="1";
            for(int i =0;i<n-1;i++){
                StringBuilder str = new StringBuilder();
                int count =1;
                for(int j =0;j<s.length();j++){
                    if(j<s.length()-1&&s.charAt(j)==s.charAt(j+1)){
                        count++;
                    }
                    else{
                        str.append(count).append(s.charAt(j));
                        count =1;
                    }
                }
                System.out.println(str.toString());
                s ="";
                s = str.toString();
                System.out.println(s);

                if(i==n){
                    k =s;
                }
            }
            return k;
        }
    }

