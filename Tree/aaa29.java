//Flatten Binary Tree to Linked List (L.C-114) using Morris Traversal
//T.C->O(n) & S.C->O(1)
public class aaa29 {
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
    public static void flattenBinaryTreeMorris(Node root){
        Node curr=root;
        while(curr!=null){
            if(curr.left!=null){
                Node pred=curr.left;
                while (pred.right!=null) {
                    pred=pred.right;
                }
                pred.right=curr.right;
                curr.right=curr.left;
                curr.left=null;
            }
            curr=curr.right;
        }
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
        flattenBinaryTreeMorris(root);
        System.out.println(root.right);
    }
}
