class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class PostorderTraversal {
    Node root;
    void postorder(Node node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
    public static void main(String[] args) {
        PostorderTraversal tree = new PostorderTraversal();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);
    }
}
