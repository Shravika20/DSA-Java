import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class InsertAtBeginning {
    Node head = null;
    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void display() {
        Node temp = head;
        System.out.print("Linked List: ");
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertAtBeginning list = new InsertAtBeginning();
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.print("Enter value: ");
            list.insertBeginning(sc.nextInt());
        }
        list.display();
        sc.close();
    }
}