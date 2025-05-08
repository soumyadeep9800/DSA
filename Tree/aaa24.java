//path sum l.c-112
public class aaa24 {
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
    public static boolean pathSum(Node root,int target){
        if(root==null) return false;
        if(root.left==null && root.right==null){
            return target == root.data;
        }
        return pathSum(root.left, target - root.data) || pathSum(root.right, target - root.data);
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
        int target=15;
        boolean result=pathSum(root, target);
        System.out.println(result);
    }
}
