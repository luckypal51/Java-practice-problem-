package Practice;

import java.util.ArrayList;

public class Matching {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> items= new ArrayList<>();
        ArrayList<String> adds = new ArrayList<>();
        adds.add("first");
        adds.add("first");
        adds.add("first");
        adds.add("first");
        adds.add("first");

        ArrayList<String> adds2 = new ArrayList<>();
        adds2.add("second ");
        adds2.add("second");
        adds2.add("second");
        adds2.add("second");
        adds2.add("second");
        items.add(0, adds);
        items.add(1, adds2);
        for(int i =0;i<items.size();i++){
            for(int j=0;j<items.get(i).size();j++){
                System.out.println(items.get(i).get(j));
            }
        }
    }
}
