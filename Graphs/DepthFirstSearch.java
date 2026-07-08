import java.util.ArrayList;
import java.util.Scanner;
public class DepthFirstSearch {
    static boolean[] visited;
    static void dfs(ArrayList<ArrayList<Integer>> graph, int node) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        visited = new boolean[vertices];
        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();
        System.out.println("Enter edges (source destination):");
        for (int i = 0; i < edges; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.get(source).add(destination);
            graph.get(destination).add(source);
        }
        System.out.print("DFS Traversal: ");
        dfs(graph, 0);
        sc.close();
    }
}