package ds;

public class Node<T>{
    private T value;
    private Node<T> next;
    private Node<T> previous;

    public Node(){
    }

    public Node(T value){
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }

        if(!(obj instanceof Node)){
            return false;
        }

        Node<T> node = (Node<T>) obj;
        return node.getValue() == this.value;
    }

    @Override
    public int hashCode() {
        return 31 * 7 + value.hashCode();
    }
}
