//Hight of the tree
public class aaa8 {
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
    static int Hight(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        int leftHight=Hight(root.left);
        int rightHight=Hight(root.right);
        int myHight=(leftHight>=rightHight?leftHight:rightHight) +1;
        return myHight;
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
        System.out.println(Hight(root));
    }
}
