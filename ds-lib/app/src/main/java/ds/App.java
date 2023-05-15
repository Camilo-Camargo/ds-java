package ds;

public class App {
    public static void main(String[] args) {
        Node<Integer> node = new Node<Integer>(10);
        System.out.println(node.equals(new Node<Integer>(10)));
        System.out.println(new Node<Integer>(10).hashCode());
    }
}
