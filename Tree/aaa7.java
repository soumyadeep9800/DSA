//sum of nodes
public class aaa7 {
    static class Node{
        int data;
        Node left,right;
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
    static int countNodesData(Node root){
        if(root==null) return 0;
        int leftSum=countNodesData(root.left);
        int rightSum=countNodesData(root.right);
        return leftSum+rightSum+root.data;
    }
    static void Display(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        Display(root.left);
        Display(root.right);
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        //System.out.println(root.data);
        Display(root);
        System.out.println();
        System.out.println("sum of nodes is: "+countNodesData(root));
    }
}
/*
 *        5
         / \
        3   7
       / \   \
      2   4   8

 */