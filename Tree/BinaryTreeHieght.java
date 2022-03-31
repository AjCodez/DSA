class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

public class BinaryTreeHieght {
    static TreeNode root;

    public static int binaryTreeHieght(TreeNode root){
        if(root==null)
            return 0;
        int l = binaryTreeHieght(root.left);
        int r = binaryTreeHieght(root.right);
        if(l>r)
            return l+1;
        else
            return r+1;
    }

    public static void main(String[] args) {
        root = new TreeNode(10);
        root.left = new TreeNode(30);
        root.right = new TreeNode(40);
        root.left.left = new TreeNode(50);
        root.left.right = new TreeNode(60);
        root.right.left = new TreeNode(55);
        root.right.right = new TreeNode(65);
        root.right.right.left = new TreeNode(65);
        root.right.right.left.right = new TreeNode(65);
        int h = binaryTreeHieght(root);
        System.out.println(h);
    }
}
