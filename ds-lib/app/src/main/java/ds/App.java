package ds;

public class App {
    public static void main(String[] args) { 
        int a = 10;
        int b = 11;

        Graph<Integer> graph = new Graph<Integer>();
        graph.add(a);
        graph.add(b);

        try{
            graph.remove(a);
        }catch(NullPointerException e){
            System.out.println(e);
        }

        graph.add(a);

        graph.addDirectEdge(a, b);
        graph.addDirectEdge(b, a);
        System.out.println(graph.getAdjVerticesList(a));
        System.out.println(graph.getAdjVerticesList(b));

        graph.removeDirectEdge(a, b);
        graph.removeDirectEdge(b, a);
        System.out.println(graph.getAdjVerticesList(a)); 
        System.out.println(graph.getAdjVerticesList(b)); 

        graph.addEdge(b, a);
        System.out.println(graph.getAdjVerticesList(a)); 
        System.out.println(graph.getAdjVerticesList(b));
    }
}
