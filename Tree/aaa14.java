//level order traversal (BFS)
import java.util.*;
public class aaa14 {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void levelOrderTraversal(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.data+" ");
            q.remove();
        }
    }

    public static void levelOrderTraversalWithNewLine(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
           Node temp=q.remove();
           if(temp==null){
              System.out.println();
              if(q.isEmpty()) break;
              else q.add(null);
           }else{
              System.out.print(temp.data+" ");
              if(temp.left!=null) q.add(temp.left);
              if(temp.right!=null) q.add(temp.right);
           }
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
        levelOrderTraversal(root);
        System.out.println();
        levelOrderTraversalWithNewLine(root);
    }
}
