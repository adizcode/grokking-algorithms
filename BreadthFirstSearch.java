// Representation of an unweighted directed graph
public class Graph {

    // Number of nodes
    private final int numOfVertices;

    // Graph stored in the form of an adjacency list
    private final LinkedList<Integer>[] adjacencyList;

    // Public constructor
    public Graph(int numOfVertices) {

        // Initialize the graph
        this.numOfVertices = numOfVertices;
        this.adjacencyList = new LinkedList[numOfVertices];

        for (int i = 0; i < numOfVertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public boolean addEdge(int source, int dest) {

        // Prevent going out of bounds
        if (source < numOfVertices) {

            // Add the adjacency pair to the graph
            adjacencyList[source].add(dest);
            return true;
        }

        return false;
    }

    // Method to perform Breadth-First Search on the calling graph object
    public boolean BFS(int rootNode, int target) {

        // Prevent going out of bounds
        if (rootNode < numOfVertices) {

            // Queue of nodes to be traversed
            Queue<Integer> queue = new LinkedList<>();

            // Array of visited nodes
            boolean[] visited = new boolean[numOfVertices];

            // Add the root node to the queue, and mark it as visited
            queue.add(rootNode);
            visited[rootNode] = true;

            // Search until queue is empty
            while (queue.size() != 0) {

                // Dequeue from the head of the queue
                int current = queue.remove();

                // Search criteria fulfilled
                // Add the search method as a lambda function to increase flexibility
                if (current == target) {
                    return true;
                }


                for (int neighbour : adjacencyList[current]) {

                    // Add neighbours of the current node to the queue (unvisited only)
                    // Mark them as visited
                    if (!visited[neighbour]) {
                        queue.add(neighbour);
                        visited[neighbour] = true;
                    }
                }
            }
        }

        // Search unsuccessful
        return false;
    }
}
