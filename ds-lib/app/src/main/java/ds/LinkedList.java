package ds;

public class LinkedList<T> {
    protected Node<T> head;
    protected Node<T> tail;

    protected long size;

    public LinkedList() {
        this.size = 0;
    }

    public LinkedList(Node<T> head) {
        this.head = head;
        this.size = 1;
    }

    public boolean isEmpty() {
        return !(this.size > 0);
    }

    public void add(T value) {

        if (isEmpty()) {
            this.head = new Node<T>(value);
            this.tail = head;
        } else {
            Node<T> next = new Node<T>(value);
            next.setPrevious(this.tail);
            this.tail.setNext(next);
            this.tail = next;
        }

        this.size++;
    }

    public void remove(T value) {
        // Warning: Remove primitive types without repetition

        if (this.isEmpty()) {
            return;
        }

        if (this.head.getValue() == value) {
            if (this.size == 1) {
                this.head = null;
            }else{
                this.head = this.head.getNext();
            }

            this.size--;
            return;
        }

        Node<T> next = this.head;
        Node<T> previous;

        while (next != null) {
            previous = next.getPrevious();

            if (value == next.getValue()) {
                previous.setNext(next.getNext());
            }

            next = next.getNext();
        }

        this.size--;
    }

    public Node<T> gethead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public long getSize() {
        return size;
    }
}
