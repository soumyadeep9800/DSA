//Morris Traversal(94)
public class aaa11 {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void MorrisTraversal(Node root){
        Node curr=root;
        while(curr!=null){
            if(curr.left!=null){
                Node pred=curr.left;
                while(pred.right!=null && pred.right!=curr){
                    pred=pred.right;
                }
                if(pred.right==null){
                    pred.right=curr;
                    curr=curr.left;
                }
                if(pred.right==curr){
                    pred.right=null;
                    System.out.print(curr.data+" ");
                    curr=curr.right;
                }
            }else{
                System.out.print(curr.data+" ");
                curr=curr.right;
            }
        }
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

        MorrisTraversal(root);
    }
}
