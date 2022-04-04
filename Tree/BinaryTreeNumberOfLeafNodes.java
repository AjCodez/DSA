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

    public static int binaryTreeNumberOfLeafNodes(TreeNode root){
        if(root.left==null && root.right==null)
            return 1;
        else{
        int l, r;
        if(root.left!=null)
            l = binaryTreeNumberOfLeafNodes(root.left);
        else 
            l=0;
        if(root.right!=null)
            r = binaryTreeNumberOfLeafNodes(root.right);
        else 
            r=0;
        return l+r;
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
        root.right.right.left = new TreeNode(65);
        root.right.right.left.right = new TreeNode(65);
        int n = binaryTreeNumberOfLeafNodes(root);
        System.out.println(n);
    }
}
