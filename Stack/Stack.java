package Stack;

 public class Stack<T> {
    T data;
    Stack<T> add= null;

     public Stack() {
     }

     public Stack(T data, Stack<T> add){
        this.data = data;
        this.add = add;
    }
}

