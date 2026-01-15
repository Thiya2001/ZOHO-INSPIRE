package CollectionsFramework;

import java.util.*;

class Graph {
    Map<String, List<String>> graph = new HashMap<>();

    public void addVertex(String v) {
        graph.putIfAbsent(v, new ArrayList<>());
    }
    public void addEdge(String v1, String v2) {
        graph.get(v1).add(v2);
        graph.get(v2).add(v1);
    }
    public void removeEdge(String v1, String v2) {
        graph.get(v1).remove(v2);
        graph.get(v2).remove(v1);
    }
    public void removeVertex(String v) {
        graph.values().forEach(list -> list.remove(v));
        graph.remove(v);
    }
    public void printGraph() {
        for (var entry : graph.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public void bfs(String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String v = queue.poll();
            System.out.print(v + " ");
            for (String neighbor : graph.getOrDefault(v, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}
public class GraphUseAddRemoveVerticlesEdges {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        g.addVertex("D");
        System.out.println("Vertices : " + g.graph.keySet());

        g.addEdge("A","B");
        g.addEdge("A","C");
        g.addEdge("B","D");
        g.addEdge("C","D");

        System.out.println("Graph : ");
        g.printGraph();

        g.removeEdge("A","C");
        System.out.println("After Removing Edge A-C : ");
        g.printGraph();

        g.removeVertex("D");
        System.out.println("After Removing Vertex D : ");
        g.printGraph();

        System.out.print("BFS Traversal from A : ");
        g.bfs("A");
    }
}