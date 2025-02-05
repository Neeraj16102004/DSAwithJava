package DataStructures.Graph;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");

        myGraph.addEdge("A","B");
        myGraph.addEdge("B","C");
        myGraph.addEdge("A","C");

        myGraph.removeEdge("A","C");
        myGraph.removeVertex("C");
        myGraph.printGraph();
    }
}
