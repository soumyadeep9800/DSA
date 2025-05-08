//invert binary tree(mirror img)226
public class aaa20 {
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
    public static void invertBinaryTree(Node root){
        if(root==null) return;
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
        //swap
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    public static void preOrderTraversal(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
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
        System.out.println(root.right.data);
        //preOrderTraversal(root);
        //System.out.println();
        invertBinaryTree(root);
        System.out.println(root.right.data);
        //preOrderTraversal(root);
    }
}
