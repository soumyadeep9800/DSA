//construct BST from preOrder Array
public class aaa8 {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insertInBST(Node root, int val) {
    if (root == null) return new Node(val);
    if (val < root.data) {
        root.left = insertInBST(root.left, val);
    } else {
        root.right = insertInBST(root.right, val);
    }
    return root;
    }
    public static Node preorderToBST(int[] preOrder){
        Node root=new Node(preOrder[0]);
        for(int i=1;i<preOrder.length;i++){
            insertInBST(root, preOrder[i]);
        }
        return root;
    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        int preOrder[]={10, 5, 3, 7, 15, 12, 17};
        Node root=preorderToBST(preOrder);
        preOrder(root);
    }
}
