//insert in BST(l.c-701)
public class aaa1 {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insertInBST(Node root,int val){
        if(root==null) return new Node(val);
        Node node=new Node(val);
        if(root.data>val){
            if(root.left==null) root.left=node;
            else insertInBST(root.left, val);
        }
        else{
            if(root.right==null) root.right=node;
            else insertInBST(root.right, val);
        }
        return root;
    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
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
        int val=1;
        preOrder(root);
        System.out.println();
        Node finalRootNode=insertInBST(root, val);
        preOrder(finalRootNode);
    }
}
