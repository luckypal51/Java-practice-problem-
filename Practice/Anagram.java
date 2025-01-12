package Practice;

import java.util.Arrays;

public class Anagram {
     public static void main(String[] args) {
        String name1 ="LISTEN";
        String name2 ="SILENT";
        name1.toLowerCase();
        name2.toLowerCase();
        char [] frist = name1.toCharArray();
        char [] sec = name2.toCharArray();
        Arrays.sort(frist);
        Arrays.sort(sec);

        if(name1.length()!=name2.length()){
            System.out.println("false");
        }else if(Arrays.equals(frist, sec)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
     }
}
