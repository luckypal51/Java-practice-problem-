package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = 0;
        int con =20;
        while (con>0){
            String a = sc.nextLine();
            if (a.isEmpty()) {
                break;}
            int p = Integer.parseInt(a);
            if(0<p&&p<17){
                t+=200;
                arr.add(p);
            } else if (p>=17&&p<40) {
                t+=400;
                arr.add(p);
            } else if (p>=40&&p<120) {
                t+=300;
                arr.add(p);

            }
            else{
                arr.add(-1);
            }
            con--;
        }
        System.out.println(arr);
        System.out.println("Total earning is "+t);
    }
}
