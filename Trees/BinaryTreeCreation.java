class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class BinaryTreeCreation {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        System.out.println("Root Node: " + root.data);
        System.out.println("Left Child: " + root.left.data);
        System.out.println("Right Child: " + root.right.data);
    }
}