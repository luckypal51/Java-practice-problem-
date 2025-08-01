package Stack;

public class StackImplementation {
    public static void main(String[] args) {
        StackData stack = new StackData();
        stack.push(1);
        stack.push("yes");
        stack.push(1.0f);
        stack.push(true);
        stack.push('A');
        stack.println();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.println();
        System.out.println(stack.peek());
    }
}
