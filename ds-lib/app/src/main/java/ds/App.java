package ds;

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(2);
        linkedList.remove(1);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.remove(3);
        //System.out.println(linkedList.gethead().getValue());
        Node<Integer> node = linkedList.gethead();

        while(node != null){
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
}
