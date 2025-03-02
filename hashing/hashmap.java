package hashing;

import javax.swing.*;
import java.util.*;

public class hashmap {
      public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India" , 120);
        map.put("Us",30);
        map.put("CHina", 150);
        System.out.println(map);
        if (map.containsKey("India")) {
            System.out.println("Yes ");
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.removeAll(Collections.singleton(true));
        System.out.println(map.get("Us"));
        for(Map.Entry<String, Integer> e: map.entrySet()){
                 System.out.println(e);
        }
      }
}
