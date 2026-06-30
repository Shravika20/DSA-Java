public class IsEmptyQueue {
    int front = 0;
    int rear = -1;
    public void isEmpty() {
        if (front > rear)
            System.out.println("Queue is Empty");
        else
            System.out.println("Queue is Not Empty");
    }
    public static void main(String[] args) {
        IsEmptyQueue q = new IsEmptyQueue();
        q.isEmpty();
    }
}