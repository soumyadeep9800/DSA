// Lowest Common Ancestor of a BST(l.c-235)
public class aaa3 {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node lowestCommoAncestor(Node root,Node a,Node b){
        if(root.data==a.data || root.data==b.data) return root;
        else if(root.data>a.data && root.data<b.data) return root;
        else if(root.data>b.data && root.data<a.data) return root;
        else if(root.data>a.data && root.data>b.data) return lowestCommoAncestor(root.left, a, b);
        else return lowestCommoAncestor(root.right, a, b); // (root.data<a.data && root.data<b.data)
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        Node a=new Node(5);
        Node b=new Node(15);
        Node c=new Node(3);
        Node d=new Node(7);
        Node e=new Node(12);
        Node f=new Node(17);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.left=e;
        b.right=f;
        Node result=lowestCommoAncestor(root, f , e);
        System.out.println(result.data);
    }
}
