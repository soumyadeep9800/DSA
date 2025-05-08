//check both tree each node data same
public class aaa17 {
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
    public static boolean sameTree(Node root,Node root1){
        if(root == null && root1 == null) return true;
        if(root1==null || root==null) return false;

        if(root.data!=root1.data) return false;
        //System.out.println(root.data+ "   "+root1.data);
        return  sameTree(root.left, root1.left) && sameTree(root.right, root1.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        root.left=a;
        root.right=b;
        a.left=c;

        Node root1=new Node(1);
        Node a1=new Node(2);
        Node b1=new Node(3);
        Node c1=new Node(4);
        root1.left=a1;
        root1.right=b1;
        a1.left=c1;
        System.out.println(sameTree(root, root1));
    }
}
