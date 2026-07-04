class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
    }
}
public class SearchNodeInTree {
    Node root;
    boolean search(Node node, int key) {
        if (node == null)
            return false;
        if (node.data == key)
            return true;
        return search(node.left, key) || search(node.right, key);
    }
    public static void main(String[] args) {
        SearchNodeInTree tree = new SearchNodeInTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        int key = 30;
        if (tree.search(tree.root, key))
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}
