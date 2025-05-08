//subtree check
public class aaa11{
    static class Node {
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
    static void Display(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        Display(root.left);
        Display(root.right);
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root=tree.buildTree(nodes);
        //System.out.println(root.data);
        Display(root);
    }
}


/*

public boolean isIdentical(TreeNode root,TreeNode subRoot){

if(root == null && subRoot == null) return true;
if(root == null || subRoot == null) return false;

if(root.val == subRoot.val){
    return isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right);
}else{
    return false;
}
}


public boolean isSubtree(TreeNode root,TreeNode subRoot){

if(subRoot==null)return true;
if(root==null) return false;

if(root.val==subRoot.val){
if(isIdentical(root,SubRoot)) return true;
}

isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
}
*/