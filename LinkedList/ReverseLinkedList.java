import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class ReverseLinkedList {

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

    public void reverse() {

        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
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

        ReverseLinkedList list = new ReverseLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
            list.insert(sc.nextInt());

        list.reverse();

        System.out.println("Reversed Linked List:");

        list.display();

        sc.close();
    }
}