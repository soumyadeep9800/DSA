//Minimum Distance between BST Nodes(783) //actually its difference
public class aaa10{
    static Node prev=null;
    static int minDiff=Integer.MAX_VALUE;
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int minimumDifferenceBetweenNode(Node root){
        if(root==null) return 0;
        minimumDifferenceBetweenNode(root.left);
        if(prev==null) prev=root;
        else{
            minDiff=Math.min(minDiff, root.data-prev.data);
        }
        minimumDifferenceBetweenNode(root.right);
        return minDiff;
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
        System.out.println(minimumDifferenceBetweenNode(root));
    }
}