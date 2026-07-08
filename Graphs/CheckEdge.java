import java.util.Scanner;
public class CheckEdge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        int[][] graph = new int[vertices][vertices];
        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();
        System.out.println("Enter edges (source destination):");
        for (int i = 0; i < edges; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph[source][destination] = 1;
            graph[destination][source] = 1;
        }
        System.out.print("Enter two vertices to check edge: ");
        int u = sc.nextInt();
        int v = sc.nextInt();
        if (graph[u][v] == 1)
            System.out.println("Edge Exists");
        else
            System.out.println("Edge Does Not Exist");
        sc.close();
    }
}
