//Search in a BST(l.c-700)
public class aaa{
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean searchInBST(Node root,int target){
        if(root==null) return false;
        if(root.data==target) return true;
        if(root.data>target) return searchInBST(root.left, target);
        else return searchInBST(root.right, target);
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
        int target=3;
        System.out.println(searchInBST(root, target));
    }
}