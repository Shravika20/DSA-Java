import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public class InsertAtEnd {
    Node head = null;
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertAtEnd list = new InsertAtEnd();
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.print("Enter value: ");
            list.insertEnd(sc.nextInt());
        }
        System.out.println("Linked List:");
        list.display();
        sc.close();
    }
}