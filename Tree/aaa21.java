public class aaa21 {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    //better approch
    // public static boolean isMirror(Node root1, Node root2) {
    //     if (root1 == null && root2 == null) return true;
    //     if (root1 == null || root2 == null) return false;
    //     if (root1.data != root2.data) return false;
    //     return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
    // }

    // public static boolean isSymmetric2(Node root) {
    //     if (root == null) return true;
    //     return isMirror(root.left, root.right);
    // }
    
    public static void invertBinaryTree(Node root){
        if(root==null) return;
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
        
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
    }

    public static boolean sameTree(Node root1,Node root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.data!=root2.data) return false;
        return sameTree(root1.left, root2.left) && sameTree(root1.right, root2.right);
    }

    public static boolean isSymmetric(Node root){
        if(root==null) return true;
        invertBinaryTree(root.left);
        return sameTree(root.left, root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(7);
        Node b=new Node(9);
        Node c=new Node(2);
        Node d=new Node(6);
        Node e=new Node(9);
        Node f=new Node(5);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.left=e;
        b.right=f;
        System.out.println(isSymmetric(root));
    }
}
