import java.util.Scanner;
public class PeekQueue {
    int max = 5;
    int[] queue = new int[max];
    int front = 0;
    int rear = -1;
    public void enqueue(int value) {
        if (rear != max - 1)
            queue[++rear] = value;
    }
    public void peek() {
        if (front > rear)
            System.out.println("Queue is Empty");
        else
            System.out.println("Front Element = " + queue[front]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PeekQueue q = new PeekQueue();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            q.enqueue(sc.nextInt());
        }
        q.peek();
        sc.close();
    }
}