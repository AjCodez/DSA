class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

public class BinaryTreeNumberOfLeafNodes {
    static TreeNode root;

    public static int binaryTreeHieght(TreeNode root, int c){
        if(root==null)
            return c+1;
        int l = binaryTreeHieght(root.left, c);
        int r = binaryTreeHieght(root.right, c);
        return c+l+r;
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
        int h = binaryTreeHieght(root, 0);
        System.out.println(h);
    }
}
