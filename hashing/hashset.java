package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        //creation
        HashSet<Integer>set = new HashSet<>();
        //insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        //search
        if (set.contains(2)) {
            System.out.println("yes do exist in the set");
        }
        if (!set.contains(6)) {
            System.out.println("set does not contain");
        }
        //deletion
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("does not contain one");
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
