//build tree 
//inorder travarsal
/*
Preorder rules--->
1.left subtree
2.root
3.right subtree
 */
public class aaa2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1) return null;

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }

    public static void inorderPrint(Node root){
        if(root==null) return;
        inorderPrint(root.left);
        System.out.print(root.data+" ");
        inorderPrint(root.right);
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree =new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
        inorderPrint(root);
    } 
}
