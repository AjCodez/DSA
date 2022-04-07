class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

public class BSTSearchANode {
    static TreeNode root;

    public static TreeNode insertion(TreeNode node,int n) {
        if(node==null){
            TreeNode tn = new TreeNode(n);
            return tn;
        }
        if(n<node.data)
            node.left = insertion(node.left, n);
        else if(n>node.data)
            node.right = insertion(node.right, n);
        return node;
    }

    public static boolean search(TreeNode root, int n) {
        if(root==null)
            return false;
        else if(root.data==n)
            return true;
        if(n<root.data)
            return search(root.left, n);
        else
            return search(root.right, n);
    }

    public static void inOrder(TreeNode Node) {
        if(Node == null)
            return; 
        inOrder(Node.left);
        System.out.print(Node.data + " ");
        inOrder(Node.right);
    }

    public static void main(String[] args) {
        root = insertion(root, 10);
        root = insertion(root, 155);
        root = insertion(root, 35);
        root = insertion(root, 180);
        root = insertion(root, 356);
        root = insertion(root, 33);
        System.out.println(search(root, 356));
        System.out.println(search(root, 357));
    }
}
