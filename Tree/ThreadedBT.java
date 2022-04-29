class Node {
    int data;
    Node left;
    Node right;
    boolean leftthread;
    boolean rightthread;

    public Node(int data) {
        this.data = data;
    }
}

public class ThreadedBT {
    public static Node leftMost(Node root) {
        if (root == null) {
            return root;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inorder(Node root) {
        Node current = leftMost(root);
        while (current != null && current.data != Integer.MIN_VALUE) {
            System.out.println(current.data);
            if (current.rightthread) {
                current = current.right;
            } else
                current = leftMost(current.right);
        }
    }

    public static void main(String[] args) {
        Node dummy = new Node(Integer.MIN_VALUE);
        Node n1 = new Node(90);
        Node n2 = new Node(20);
        Node n3 = new Node(50);
        Node n4 = new Node(60);
        // adding left and right child here
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        // utilization of dummy node
        dummy.left = n1;
        dummy.right = dummy;
        dummy.rightthread = true;
        // now adding thread with each of the node
        n4.right = n2;
        n4.rightthread = true;
        n2.right = n1;
        n2.rightthread = true;
        n3.right = dummy;
        n3.rightthread = true;
        inorder(dummy);
    }
}