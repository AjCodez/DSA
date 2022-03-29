class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
    TreeNode(){}
}

public class BinaryTreeArr {
    static TreeNode root;
    static int i = 0;

    static TreeNode put(int a[],int n)
    {
        if(i>=n)
        return null;
        TreeNode r = new TreeNode(a[i]);
        ++i;
        r.left = put(a,n);
        ++i;
        r.right = put(a,n);
        return r;
    }

    public static void Traverse(TreeNode Node) {

        if(Node==null)
        return;

        System.out.print(Node.data+" ");
        Traverse(Node.left);
        Traverse(Node.right);
        
    }
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6,7,8,9};
        TreeNode r =put(a,a.length);
        Traverse(r);
    }
}