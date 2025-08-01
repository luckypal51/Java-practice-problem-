package Stack;

public class StackData {
    Stack top =null;
    public<T> void push(T data){
        if(top==null){
        Stack<T> stk = new Stack<T>(data,null);
        top = stk;
    } else{
        Stack<T> stack = new Stack<T>(data,top);
        top = stack;}
    }
    public void println(){
        Stack stack = top;
        if(stack==null){
            System.out.println("Stack is underflow");
            return;
        }
        System.out.print("[");
        while (stack.add!=null){
            System.out.print(stack.data+", ");
            stack = stack.add;
        }
        System.out.print(stack.data+"]");
        System.out.println();
    }
    public void pop(){
        if(top==null){
            System.out.println("Stack underflow");
            return;
        }
        Stack st = top;
        System.out.println("Deleted element is: "+st.data);
        top= st.add;
    }
    public String peek(){
        if (top==null){
            System.out.println("Stack is Empty");
            System.exit(0);
        }
        try{
            return top.data.toString();
        }catch (Exception e){
            System.out.println("data not available");
        }
        return null;
    }
}
