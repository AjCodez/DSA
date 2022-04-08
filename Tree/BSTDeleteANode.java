
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

public class BSTDeleteANode {
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

    public static TreeNode deletion(TreeNode root, int n) {
        if(root==null)
            return root;
        if(n<root.data)
            root.left = deletion(root.left, n);
        else if(n>root.data)
            root.right = deletion(root.right, n);
        else{
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            root.data = minValue(root);
            root.right = deletion(root.right, root.data);
            // else 
            //     return null;
        }
        return root;
    }

    public static int minValue(TreeNode root){
        int min = root.data;
        while (root.left != null){
            min = root.left.data;
            root = root.left;
        }
        return min;
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
        root = deletion(root, 155);
        inOrder(root);
    }
}
