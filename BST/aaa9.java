//convert BST to Greater Tree(538)
public class aaa9 {
    static int sum = 0;
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void convertToGreaterTree(Node root) {
    if (root == null) return;

    convertToGreaterTree(root.right);  // 1. Traverse right
    sum += root.data;                  // 2. Accumulate sum
    root.data = sum;                   // 3. Update current node
    convertToGreaterTree(root.left);   // 4. Traverse left
    }
    public static void Traversal(Node root){
        if(root==null) return;
        Traversal(root.left);
        System.out.print(root.data+" ");
        Traversal(root.right);
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

        Traversal(root);
        System.out.println();
        convertToGreaterTree(root);
        Traversal(root);
    }
}
