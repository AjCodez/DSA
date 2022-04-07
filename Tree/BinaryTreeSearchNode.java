class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

public class BinaryTreeSearchNode {
    static TreeNode root;

    public static boolean search(TreeNode root, int n) {
        if (root==null)
            return false;
        else if(root.data==n)
            return true;
        if(search(root.left, n)||search(root.right, n))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        root = new TreeNode(10);
        root.left = new TreeNode(30);
        root.right = new TreeNode(40);
        root.left.left = new TreeNode(50);
        root.left.right = new TreeNode(60);
        root.right.left = new TreeNode(55);
        root.right.right = new TreeNode(65);
        root.left.right.left = new TreeNode(65);
        root.left.right.right = new TreeNode(65);
        System.out.println(search(root, 40));
        System.out.println(search(root, 45));
    }
}
