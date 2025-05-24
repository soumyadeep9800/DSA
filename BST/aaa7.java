//Kth smallest element in a BST (230)
public class aaa7 {
    static int count = 0;
    static int result = -1;
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    private static void helper(Node root, int k) {
        if(root==null) return;
        helper(root.left, k);
        count++;
        if(count==k){
            result=root.data;
            return;
        }
        helper(root.right, k);
    }
    public static int kthElement(Node root,int k){
        if (k <= 0) return -1;
        count=0;
        result=-1;
        helper(root,k);
        return result;
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
        int k=3;
        System.out.println(kthElement(root, k));
    }
}
