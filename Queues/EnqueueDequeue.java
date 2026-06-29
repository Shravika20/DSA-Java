import java.util.Scanner;
public class EnqueueDequeue {
    int max = 5;
    int[] queue = new int[max];
    int front = 0;
    int rear = -1;
    public void enqueue(int value) {
        if (rear == max - 1)
            System.out.println("Queue Overflow");
        else
            queue[++rear] = value;
    }
    public void dequeue() {
        if (front > rear)
            System.out.println("Queue Underflow");
        else
            System.out.println("Deleted Element = " + queue[front++]);
    }
    public void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Queue Elements:");
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EnqueueDequeue q = new EnqueueDequeue();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            q.enqueue(sc.nextInt());
        }
        q.dequeue();
        q.display();
        sc.close();
    }
}