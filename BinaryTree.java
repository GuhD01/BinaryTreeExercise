public class BinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    BinaryTree(int data) {
        root = new Node(data);
    }

    int countNodes(Node node) {
        if (node == null) {
            return 0;
        }

        int countLeft = countNodes(node.left);
        int countRight = countNodes(node.right);

        return 1 + countLeft + countRight;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(5);

        int nodeCount = tree.countNodes(tree.root);
        System.out.println("Number of nodes in the binary tree: " + nodeCount);
    }
}
