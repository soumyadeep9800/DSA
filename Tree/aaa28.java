//Flatten Binary Tree to Linked List (L.C-114)
//T.C->O(n) & S.C->O(h)
public class aaa28 {
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
    public static void flattenBinaryTree(Node root){
        if(root==null) return;

        Node leftTree=root.left;
        Node rightTree=root.right;

        flattenBinaryTree(leftTree);
        flattenBinaryTree(rightTree);

        root.left = null;

        root.right=leftTree;
        Node temp=leftTree;
        while(temp!=null && temp.right!=null){
            temp=temp.right;
        }
        if(temp!=null)temp.right=rightTree;
        else root.right=rightTree;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(7);
        Node b=new Node(9);
        Node c=new Node(2);
        Node d=new Node(6);
        Node e=new Node(9);
        Node f=new Node(5);
        Node g=new Node(11);
        Node h=new Node(5);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.right=e;
        d.left=f;
        d.right=g;
        e.left=h;
        flattenBinaryTree(root);
        System.out.println(root.right.data);
    }
}
