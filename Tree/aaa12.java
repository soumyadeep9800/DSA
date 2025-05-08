//PW 1st lec
//basic operation
public class aaa12 {
    static int count = 0;
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
    public static void preorderdisplay(Node root){
        if (root==null) return;
        System.out.print(root.data+" ");
        preorderdisplay(root.left);
        preorderdisplay(root.right);
    }
    public static void display(Node root){
        if (root==null) return;
        System.out.print(root.data+" -> ");
        if(root.left!=null) System.out.print(root.left.data+" ");
        if(root.right!=null) System.out.print(root.right.data);
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static int SizeOfTree(Node root){
       if(root == null) return 0;
       int left=SizeOfTree(root.left);
       int right=SizeOfTree(root.right);
       return left+right+1;
    }
    public static void SizeOfTree1(Node root){
       if(root == null) return;
       count++;
       SizeOfTree1(root.left);
       SizeOfTree1(root.right);
    }
    public static int sumOfNodes(Node root){ 
      if(root==null) return 0;
      return root.data+sumOfNodes(root.left)+sumOfNodes(root.right);
    }
    public static int maxNodeValue(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int leftmax=maxNodeValue(root.left);
        int rightmax=maxNodeValue(root.right);
        return Math.max(root.data, Math.max(leftmax, rightmax));
    }
    public static int heightOfTree(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        int leftheight=heightOfTree(root.left);
        int rightheight=heightOfTree(root.right);
        return Math.max(leftheight, rightheight)+1;
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
        // root.left=a;
        // a.left=b;
        preorderdisplay(root);
        System.out.println();
        display(root);
        System.out.println("total number of nodes:"+SizeOfTree(root));
        SizeOfTree1(root);
        System.out.println("total number of nodes:"+count);
        System.out.println("sum od nodes:"+sumOfNodes(root));
        System.out.println("max node value is:"+maxNodeValue(root));
        System.out.println("height of the tree:"+heightOfTree(root));
    }
}
