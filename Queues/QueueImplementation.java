import java.util.Scanner;
public class QueueImplementation {
    int max = 5;
    int[] queue = new int[max];
    int front = 0;
    int rear = -1;
    public void enqueue(int value) {
        if (rear == max - 1) {
            System.out.println("Queue Overflow");
        } else {
            queue[++rear] = value;
            System.out.println(value + " inserted into queue");
        }
    }
    public void display() {
        if (rear < front) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Queue Elements:");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueImplementation q = new QueueImplementation();
        System.out.print("Enter number of elements (Maximum 5): ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            q.enqueue(sc.nextInt());
        }
        q.display();
        sc.close();
    }
}