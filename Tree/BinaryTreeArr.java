class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class BinaryTreeArr {
    static Node root;

    public static Node buildBinaryTree(int arr[], int i) {
        i++;
        if (arr[i] == -1)
            return null;
        Node node = new Node(arr[i]);
        node.left = buildBinaryTree(arr, i);
        node.right = buildBinaryTree(arr, i);
        return node;
    }

    public static void postOrder(Node Node) {
        if (Node == null)
            return;
        postOrder(Node.left);
        postOrder(Node.right);
        System.out.print(Node.data + " ");
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, 1, 5, 3, 4, 7 };
        root = buildBinaryTree(arr, -1);
        postOrder(root);
    }
}