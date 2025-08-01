package LinkeListImplement;

public class LinkeList {
    Node head;
    public void insert(int data){
        Node node = new Node(data);
        if(head==null){
            head =node;
            return;
        }
        Node current = head;
        while (current.getAddress()!=null){
            current = current.getAddress();
        }
         current.setAddress(node);
    }
    public void print(){
        Node cur = head;
        System.out.print("[");
        while (cur.getAddress()!=null){
            System.out.print(cur.getData()+", ");
            cur = cur.getAddress();
        }
        System.out.print(cur.getData()+"]");
        System.out.println();
    }
    public void delete(){
        Node cur = head;
        if(head==null){
            System.out.println("Linkelist is empty!");
            return;
        }
        if(cur.getAddress()==null){
            head = null;
            System.out.println(cur.getData()+": Deleted element !");
            return;
        }
        while (cur.getAddress().getAddress()!=null){

            cur=cur.getAddress();
        }
        System.out.println(cur.getAddress().getData()+" : Deleted element");
        cur.setAddress(null);
    }
    public void deleteAt(int position){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(position==0){
            System.out.println(head.getData()+": is deleted ");
            head = head.getAddress();
            return;
        }
        Node cur = head;
        int curpos =0;
        while (cur.getAddress()!=null&&curpos==position-1){
            cur = cur.getAddress();
            curpos++;
        }
        if (cur.getAddress() == null) {
            System.out.println("Position exceeds list length!");
            return;
        }
            System.out.println(cur.getAddress().getData()+": Deleted element|");
            cur.setAddress(cur.getAddress().getAddress());
    }
}
