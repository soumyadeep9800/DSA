//zigzag levelorder 103 
public class aaa22 {
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
    public static int Height(Node root){
        if(root==null) return 0;
        return Math.max(Height(root.left), Height(root.right))+1;
    }
    public static void zigzagLevelOrder(Node root,int n,int x){
        if(root==null) return;
        if(n==1){
            System.out.print(root.data+" ");
            return;
        }
        if(x%2==0){
            zigzagLevelOrder(root.right, n-1,x);
            zigzagLevelOrder(root.left, n-1,x);
        }else{
            zigzagLevelOrder(root.left, n-1,x);
            zigzagLevelOrder(root.right, n-1,x);
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.right=e;
        int height=Height(root);
        for(int i=1;i<=height;i++){
            zigzagLevelOrder(root, i,i);
            System.out.println();
        }
    }
}
