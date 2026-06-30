import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class QueueUsingCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            queue.offer(sc.nextInt());
        }
        System.out.println("Queue: " + queue);
        System.out.println("Removed Element: " + queue.poll());
        System.out.println("Queue after Dequeue: " + queue);
        sc.close();
    }
}