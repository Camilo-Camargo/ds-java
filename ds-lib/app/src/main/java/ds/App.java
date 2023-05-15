package ds;

public class App {
    public static void main(String[] args) { 
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(15);
        stack.push(11);
        stack.push(12);
        System.out.println(stack.getSize());
        System.out.println(stack.pop().getValue());
        System.out.println(stack.pop().getValue());
        System.out.println(stack.pop().getValue());
        System.out.println(stack.pop());
        System.out.println(stack.getSize());
    }
}
