package ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {
    private Map<Node<T>, List<Node<T>>> adjVertices;

    public Graph() {
        this.adjVertices = new HashMap<>();
    }

    void add(T value) {
        this.adjVertices.putIfAbsent(new Node<T>(value), new ArrayList<>());
    }

    void remove(T value) throws NullPointerException {
        adjVertices.values().stream().forEach(e -> e.remove(new Node<T>(value)));
        adjVertices.remove(new Node<T>(value));
    }

    void addDirectEdge(T from, T target) {
        Node<T> fromNode = new Node<T>(from);
        Node<T> targetNode = new Node<T>(target);
        adjVertices.get(fromNode).add(targetNode);
    }

    boolean removeDirectEdge(T from, T target){
        return adjVertices.get(new Node<T>(from)).remove(new Node<T>(target));
    }

    boolean removeEdge(T from, T target){
        return removeDirectEdge(from, target) &&
               removeDirectEdge(target, from); 
    }

    void addEdge(T from, T target) {
        addDirectEdge(from, target);
        addDirectEdge(target, from);
    }

    List<Node<T>> getAdjVerticesList(T from) {
        return adjVertices.get(new Node<T>(from));
    }
}
