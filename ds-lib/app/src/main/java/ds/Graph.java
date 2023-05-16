package ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {
    private Map<VertexNode<T>, List<VertexNode<T>>> adjVertices;

    public Graph() {
        this.adjVertices = new HashMap<>();
    }

    void add(T value) {
        this.adjVertices.putIfAbsent(new VertexNode<T>(value), new ArrayList<>());
    }

    void remove(T value) throws NullPointerException {
        adjVertices.values().stream().forEach(e -> e.remove(new VertexNode<T>(value)));
        adjVertices.remove(new VertexNode<T>(value));
    }

    void addDirectEdge(T from, T target) {
        VertexNode<T> fromVertexNode = new VertexNode<T>(from);
        VertexNode<T> targetVertexNode = new VertexNode<T>(target);
        adjVertices.get(fromVertexNode).add(targetVertexNode);
    }

    boolean removeDirectEdge(T from, T target){
        return adjVertices.get(new VertexNode<T>(from)).remove(new VertexNode<T>(target));
    }

    boolean removeEdge(T from, T target){
        return removeDirectEdge(from, target) &&
               removeDirectEdge(target, from); 
    }

    void addEdge(T from, T target) {
        addDirectEdge(from, target);
        addDirectEdge(target, from);
    }

    List<VertexNode<T>> getAdjVerticesList(T from) {
        return adjVertices.get(new VertexNode<T>(from));
    }
}
