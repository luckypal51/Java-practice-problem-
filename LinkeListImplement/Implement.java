package LinkeListImplement;

public class Implement {
    public static void main(String[] args) {
        LinkeList list = new LinkeList();
        list.insert(12);
        list.insert(14);
        list.insert(15);
        list.print();
        list.deleteAt(1);
        list.print();
    }
}
