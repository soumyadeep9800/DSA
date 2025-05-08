public class aaa15 {
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
    public static int diameter(Node root){
        if(root == null) return 0;
        int dia1=diameter(root.left);
        int dia2=diameter(root.right);
        int dia3=height(root.left)+height(root.right)+1;
        return Math.max(dia3, Math.max(dia1, dia2));
    }
    public static int height(Node root){
        if(root == null) return 0;
        int leftH=height(root.left);
        int rightH=height(root.right);
        return Math.max(leftH, rightH)+1;
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
        System.out.println(diameter(root));
    }
}
