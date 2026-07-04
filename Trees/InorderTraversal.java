class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
    }
}
public class InorderTraversal {
    Node root;
    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    public static void main(String[] args) {
        InorderTraversal tree = new InorderTraversal();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
    }
}

