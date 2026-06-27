import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DeleteNode {

    Node head = null;

    public void insert(int data) {

        Node newNode = new Node(data);

        if(head == null)
            head = newNode;
        else {

            Node temp = head;

            while(temp.next != null)
                temp = temp.next;

            temp.next = newNode;
        }
    }

    public void delete(int key) {

        if(head == null)
            return;

        if(head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;

        while(temp.next != null && temp.next.data != key)
            temp = temp.next;

        if(temp.next != null)
            temp.next = temp.next.next;
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

        DeleteNode list = new DeleteNode();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
            list.insert(sc.nextInt());

        System.out.print("Enter value to delete: ");
        int key = sc.nextInt();

        list.delete(key);

        System.out.println("Updated Linked List:");

        list.display();

        sc.close();
    }
}