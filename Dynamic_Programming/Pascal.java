package Dynamic_Programming;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public static void main(String[] args) {

    }
    public static ArrayList<List<Integer>> pascal(int n,ArrayList<List<Integer>> a) {
        if (n == 1) {
            a.add(List.of(1));
            return a;
        }
        pascal(n - 1, a);
        ArrayList<Integer> pre = new ArrayList<>();
        pre.addAll(a.get(a.size() - 1));
        ArrayList<Integer> cur = new ArrayList<>();
        cur.add(1);
        for (int i = 0; i <= pre.size() - 1; i++) {
            int sum = pre.get(i) + pre.get(i + 1);
            cur.add(sum);
        }
        cur.add(1);
        return a;
    }
}
