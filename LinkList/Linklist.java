package LinkList;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.Tree;

import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.addFirst(0);
        list.add(2);
        System.out.println(list);
        for (int i =0;i<list.size();i++){
            System.out.print(list.get(i));
        }
    }
}
