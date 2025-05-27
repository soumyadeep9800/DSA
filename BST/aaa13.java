//Trim a binary search Tree (669)
public class aaa13{
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void inOrderTraversal(Node root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    public static Node trimBST(Node root,int low,int high){
        Node Parent=new Node(Integer.MAX_VALUE);
        Parent.left=root;
        helper(Parent,low,high);
        return Parent.left;
    }
    private static void helper(aaa13.Node root, int low, int high) {
        if(root==null) return;
        while(root.left!=null){
            if(root.left.data<low) root.left=root.left.right;
            else if(root.left.data>high) root.left=root.left.left;
            else break;
        }
        while(root.right!=null){
            if(root.right.data<low) root.right=root.right.right;
            else if(root.right.data>high) root.right=root.right.left;
            else break;
        }
        helper(root.left, low, high);
        helper(root.right, low, high);
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        Node a=new Node(5);
        Node b=new Node(15);
        Node c=new Node(3);
        Node d=new Node(7);
        Node e=new Node(12);
        Node f=new Node(17);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        inOrderTraversal(root);
        System.out.println();
        Node finalRoot=trimBST(root, 6, 10);
        inOrderTraversal(finalRoot);
    }
}
// public static Node trimBST(Node root, int low, int high) {
//     if (root == null) return null;

//     if (root.data < low) return trimBST(root.right, low, high);
//     if (root.data > high) return trimBST(root.left, low, high);

//     root.left = trimBST(root.left, low, high);
//     root.right = trimBST(root.right, low, high);
//     return root;
// }
