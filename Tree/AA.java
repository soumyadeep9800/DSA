
import java.util.LinkedList;
import java.util.Queue;

public class AA {
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
    private static void NthLevel(Node root,int n){
        if(root==null) return;
        if(n==1){
            System.out.print(root.data+" ");
            return;
        }
        NthLevel(root.left, n-1);
        NthLevel(root.right, n-1);
    }
    private static int Height(Node root){
        if(root==null)return 0;
        int leftheight=Height(root.left);
        int rightheight=Height(root.right);
        int maxHeight=Math.max(leftheight, rightheight);
        return  maxHeight+1;
    }


    private static void Lvelorder(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
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
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(7);

        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.left=e;
        b.right=f;
 
        // int Level=Height(root);
        // System.out.println("height of the tree is :"+Level);
        
        // for(int i=1;i<=Level;i++){
        //     NthLevel(root,i);
        //     System.out.println();
        // }
        Lvelorder(root);
    }
}
