class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

public class BinaryTree {
    static TreeNode root;
    BinaryTree(){
        root = null;
    }
    public static void postOrder(TreeNode Node) {
        if(Node == null)
            return; 
        postOrder(Node.left);
        postOrder(Node.right);
        System.out.print(Node.data + " ");
    }
    public static void inOrder(TreeNode Node) {
        if(Node == null)
            return; 
        inOrder(Node.left);
        System.out.print(Node.data + " ");
        inOrder(Node.right);
    }
    public static void preOrder(TreeNode Node) {
        if(Node == null)
            return; 
        System.out.print(Node.data + " ");
        preOrder(Node.left);
        preOrder(Node.right);
    }
    public static void main(String[] args) {
        root = new TreeNode(10);
        root.left = new TreeNode(30);
        root.right = new TreeNode(40);
        root.left.left = new TreeNode(50);
        root.left.right = new TreeNode(60);
        root.right.left = new TreeNode(55);
        root.right.right = new TreeNode(65);
        postOrder(root);
        System.out.println("");
        inOrder(root);
        System.out.println("");
        preOrder(root);
    }
}