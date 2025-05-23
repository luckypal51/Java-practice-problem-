package Practice;

import java.util.Scanner;

public class BinaryConversion {
    public static void main(String[] args) {
        System.out.println(binary(7));
    }
    public static int binary(int i){
      if(i==0){
          return 0;
      }
      if(i==1){
          return 1;
      }
      return (binary(i/2)*10)+(i%2);
    }
}
