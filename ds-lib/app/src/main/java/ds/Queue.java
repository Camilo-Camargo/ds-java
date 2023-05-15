package ds;

class Queue<T> extends LinkedList<T> {

    public void push(T value) {
        this.add(value);
    }

    public Node<T> pop() {
        if(this.isEmpty()){
            return null;
        }

        Node<T> head = this.head;

        if(head != null) {
            this.head = head.getNext();
        }

        this.size--;
        return head;
    }

}
