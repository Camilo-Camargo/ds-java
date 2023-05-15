package ds;

public class Stack<T> extends LinkedList<T>{
    public void push(T value){ 
        this.add(value);
    }

    public Node<T> pop(){
        if(this.isEmpty()){
            return null;
        } 

        Node<T> tail = this.tail;
        if(tail != null){
            Node<T> previous = tail.getPrevious();
            if(previous != null){
                previous.setNext(null);
                this.tail = previous;
            }else{
                this.head = null;
            }
        }
        this.size--;
        return tail;
    }
}
