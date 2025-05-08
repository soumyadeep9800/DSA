//path Sum3(l.c-437)
public class aaa26 {
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
    public static int noOfPaths(Node root,long target){
        int count=0;
        if(root==null) return 0;
        if((long)root.data==target){
            count++;
        }
        return count + noOfPaths(root.left, target-(long)root.data)+noOfPaths(root.right, target-(long)root.data);
    }
    public static int pathSum(Node root,int target){
        if(root==null) return 0;
        int count=noOfPaths(root,(long)(target));
        count+= (pathSum(root.left, target)+pathSum(root.right, target));
        return count;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left  = new Node(7);
        root.right = new Node(9);
        root.left.left        = new Node(2);
        root.left.left.left   = new Node(5);
        root.left.right       = new Node(6);
        root.left.right.left  = new Node(5);
        root.left.right.right = new Node(11);
        root.right.right      = new Node(9);
        root.right.right.left = new Node(5);

        int result=pathSum(root, 15);
        System.out.println(result);
    }
}
