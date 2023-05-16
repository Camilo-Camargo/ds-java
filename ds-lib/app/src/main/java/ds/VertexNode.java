package ds;

public class VertexNode<T> extends Node<T>{
    public VertexNode(){

    }

    public VertexNode(T value){
        this.value = value;
    }

    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
