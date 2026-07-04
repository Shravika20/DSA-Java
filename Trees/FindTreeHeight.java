class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
    }
}
public class FindTreeHeight {
    Node root;
    int height(Node node) {
        if (node == null)
            return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {
        FindTreeHeight tree = new FindTreeHeight();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        System.out.println("Height of Tree: " + tree.height(tree.root));
    }
}
