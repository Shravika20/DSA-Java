class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
    }
}
public class CountNodesInTree {
    Node root;
    int countNodes(Node node) {
        if (node == null)
            return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
    public static void main(String[] args) {
        CountNodesInTree tree = new CountNodesInTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        System.out.println("Number of Nodes: " + tree.countNodes(tree.root));
    }
}