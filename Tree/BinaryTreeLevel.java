class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

public class BinaryTreeLevel {
    static TreeNode root;

    public static int binaryTreeLevels(TreeNode root){
        if(root==null)
            return 0;
        int l = binaryTreeLevels(root.left);
        int r = binaryTreeLevels(root.right);
        if(l>r)
            return l+1;
        else
            return r+1;
    }

    public static void printLevel(TreeNode root, int l) {
        if(root == null)
            return;
        if(l==1)
            System.out.println(root.data);
        else{
            printLevel(root.left, l-1);
            printLevel(root.right, l-1);
        }
    }

    public static void binaryTreeLevel(TreeNode root){
        int h = binaryTreeLevels(root);
        for (int i = 1; i < h+1; i++) {
            printLevel(root, i);
        }
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
        binaryTreeLevel(root);
    }
}
