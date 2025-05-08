//print element nth level and also using loop level order traversal
public class aaa13 {
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
    public static void nthLevel(Node root,int n){
        if(root==null) return;
        if(n==1){
        System.out.print(root.data+" ");
        return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static int heightOfTree(Node root){
        if(root==null) return 0;
        //if(root.left==null && root.right==null) return 0;
        int leftheight=heightOfTree(root.left);
        int rightheight=heightOfTree(root.right);
        return Math.max(leftheight, rightheight)+1;
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
        // int n=3;
        // nthLevel(root, n);
        //System.out.println();
        int level=heightOfTree(root);
        System.out.println(level);
        for(int i=1;i<=level;i++){
            nthLevel(root,i);
            System.out.println();
        }
    }
}



    // public static int sumOfNodesAtnthLevel(Node root,int n){
    //     if(root==null) return 0;
    //     if(n==1){
    //         return root.data+nthLevel(root.left,n-1)+nthLevel(root.right,n-1);
    //     } 
    //     nthLevel(root.left,n-1);
    //     nthLevel(root.right,n-1);
    // }
