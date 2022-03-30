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
    public static void Traverse(TreeNode Node) {
        if(Node == null)
            return; 
        Traverse(Node.left);
        Traverse(Node.right);
        System.out.print(Node.data + " ");
    }
    public static void main(String[] args) {
        root = new TreeNode(10);
        root.left = new TreeNode(30);
        root.right = new TreeNode(40);
        root.left.left = new TreeNode(50);
        root.left.right = new TreeNode(60);
        root.right.left = new TreeNode(55);
        root.right.right = new TreeNode(65);
        Traverse(root);
    }
}