import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SearchLinkedList {
    Node head = null;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void search(int key) {
        Node temp = head;
        int position = 1;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found at position " + position);
                return;
            }
            temp = temp.next;
            position++;
        }
        System.out.println("Element not found.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchLinkedList list = new SearchLinkedList();
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter data for node " + i + ": ");
            int value = sc.nextInt();
            list.insert(value);
        }
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        list.search(key);
        sc.close();
    }
}