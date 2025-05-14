//delete Node in BST(l.c450)
public class aaa2{
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void deleteNode(Node root,int target){
        if(root==null) return;
        if(root.data>target){// go left
            if(root.left==null) return;
            if(root.left.data==target){
                Node ll=root.left;
                if(ll.left==null && ll.right==null) root.left=null;//0 child
                else if(ll.left==null || ll.right==null){//1 child
                    if(ll.left!=null) root.left=ll.left;
                    else root.left=ll.right;
                }else{ //2 child
                    Node curr=ll;
                    Node pred=curr.left;
                    while(pred.right!=null) pred=pred.right;
                    deleteNode(root, pred.data);
                    pred.left=curr.left;
                    pred.right=curr.right;
                    root.left=pred;
                }
            }
            else deleteNode(root.left, target);
        }
        else{//go right
            if(root.right==null) return;
            if(root.right.data==target){
                Node rr=root.right;
                if(rr.left==null && rr.right==null) root.right=null;//0 child
                else if(rr.left==null || rr.right==null){//1 child
                    if(rr.left!=null) root.right=rr.left;
                    else root.right=rr.right;
                }else{ //2 child
                    Node curr=rr;
                    Node pred=curr.left;
                    while(pred.right!=null) pred=pred.right;
                    deleteNode(root, pred.data);
                    pred.left=curr.left;
                    pred.right=curr.right;
                    root.right=pred;
                }
            }
            else deleteNode(root.right, target);
        }
    }
    public static Node finalDelete(Node root,int target){
        Node fake=new Node(Integer.MAX_VALUE);// for delete root node
        fake.left=root;
        deleteNode(fake, target);
        root=fake.left;
        return root;
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
        preOrder(root);
        System.out.println();
        root=finalDelete(root, 10);
        preOrder(root);
    }
}