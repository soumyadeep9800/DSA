//Recover Binary Search Tree(99)
import java.util.ArrayList;
public class aaa14 {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void recoverBST(Node root){
        Node curr=root;
        Node prev=null;
        Node prevPrev=null;
        ArrayList<Node> arr=new ArrayList<>();
        while(curr!=null){
            if(curr.left!=null){
                Node pred=curr.left;
                while (pred.right!=null && pred.right!=curr) pred=pred.right;
                if(pred.right==null){
                    pred.right=curr;
                    curr = curr.left;
                }
                if(pred.right==curr){
                    pred.right=null;
                    //visit
                    if(prev!=null && prevPrev!=null){
                        if(prev.data>curr.data && prev.data>prevPrev.data) arr.add(prev);
                        if(prev.data<curr.data && prev.data<prevPrev.data) arr.add(prev);
                    }else if(prev!=null){
                        if(prev.data>curr.data) arr.add(prev);
                    }
                    prevPrev=prev;
                    prev=curr;
                    curr=curr.right;
                }
            }else{//visit
                if(prev!=null && prevPrev!=null){
                    if(prev.data>curr.data && prev.data>prevPrev.data) arr.add(prev);
                    if(prev.data<curr.data && prev.data<prevPrev.data) arr.add(prev);
                }else if(prev!=null && prev.data>curr.data) arr.add(prev);
                prevPrev=prev;
                prev=curr;
                curr=curr.right;
            }
        }
        if(prev.data<prevPrev.data) arr.add(prev);
            Node first=arr.get(0);
            Node second=arr.get(arr.size()-1);
            int temp=first.data;
            first.data=second.data;
            second.data=temp;
    }
    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        Node a=new Node(1);
        Node b=new Node(4);
        Node c=new Node(2);
        root.left=a;
        root.right=b;
        b.left=c;
        inOrder(root);
        System.out.println();
        recoverBST(root);
        inOrder(root);
    }
}
