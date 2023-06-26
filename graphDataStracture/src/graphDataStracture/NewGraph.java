package graphDataStracture;
import java.util.*;
public class NewGraph {
	
	    private Map<String, Set<String>> adjList;

	    public NewGraph() {
	        adjList = new HashMap<>();
	    }

	    public void addVertex(String vertex) {
	        if (!adjList.containsKey(vertex)) {
	            adjList.put(vertex, new HashSet<>());
	        }
	    }

	    public void addEdge(String vertex1, String vertex2) {
	        if (!adjList.containsKey(vertex1)) {
	            addVertex(vertex1);
	        }
	        if (!adjList.containsKey(vertex2)) {
	            addVertex(vertex2);
	        }
	        adjList.get(vertex1).add(vertex2);
	        adjList.get(vertex2).add(vertex1);
	    }

	    public void bfs(String startingVertex) {
	        Map<String, Boolean> visited = new HashMap<>();
	        Queue<String> queue = new LinkedList<>();

	        visited.put(startingVertex, true);
	        queue.offer(startingVertex);

	        while (!queue.isEmpty()) {
	            String vertex = queue.poll();
	            System.out.println(vertex);

	            for (String neighbor : adjList.get(vertex)) {
	                if (!visited.containsKey(neighbor)) {
	                    visited.put(neighbor, true);
	                    queue.offer(neighbor);
	                }
	            }
	        }
	    }

	    public void display() {
	        for (String vertex : adjList.keySet()) {
	            System.out.print(vertex + "->");
	            System.out.println(adjList.get(vertex));
	        }
	    }
	    public static void main(String[] args) {
	    	NewGraph graph = new NewGraph();
	    	graph.addVertex("a");
	    	graph.addVertex("b");
	    	graph.addVertex("c");
	    	graph.addEdge("a", "b");
	    	graph.addEdge("b", "c");
	    	graph.display();
//	    	graph.bfs("a");

		}
	}



