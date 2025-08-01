package LinkeListImplement;

public class Node {
    private int data ;
    private Node address;
    Node(int data){
        this.data = data;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return this.data;
    }
    public void setAddress(Node address){
        this.address = address;
    }

    public Node getAddress() {
        return this.address;
    }
}
