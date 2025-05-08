// check balance tree gap 1 thake basi
public class aaa16 {
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
    public static int Height(Node root){
        if(root==null) return 0;
        int lh=Height(root.left);
        int rl=Height(root.right);
        return Math.max(lh, rl)+1;
    }
    public static boolean isBalanced(Node root){
        if(root==null) return true;
        int ll=Height(root.left);
        int rr=Height(root.right);
        int diffrence=ll-rr;
        if(diffrence<0) diffrence = -diffrence;
        if(diffrence>1) return false;
        return  isBalanced(root.left) && isBalanced(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(7);
        Node b=new Node(9);
        // Node c=new Node(2);
        // Node d=new Node(6);
        // Node e=new Node(9);
        root.left=a;
        a.left=b;
      
        System.out.println(isBalanced(root));
    }
}



//  public static boolean isBalanced1(Node root) {
//     return checkHeight(root) != -1;
//     }
//     // Helper method to check the height and balance
//     private static int checkHeight(Node root) {
//         if (root == null) return 0; // Base case: height of null node is 0
        
//         int leftHeight = checkHeight(root.left);
//         if (leftHeight == -1) return -1; // If left subtree is unbalanced, return -1
        
//         int rightHeight = checkHeight(root.right);
//         if (rightHeight == -1) return -1; // If right subtree is unbalanced, return -1
        
//         if (Math.abs(leftHeight - rightHeight) > 1) return -1; // If current node is unbalanced, return -1
        
//         return Math.max(leftHeight, rightHeight) + 1; // Return the height of the current node
//     }