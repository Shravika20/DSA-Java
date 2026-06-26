import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public class CountNodes {
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
    public void countNodes() {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Number of Nodes = " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountNodes list = new CountNodes();
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }
        list.countNodes();
        sc.close();
    }
}