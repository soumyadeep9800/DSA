//large diameter of the tree O(n)
public class aaa10 {
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
    static void Display(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        Display(root.left);
        Display(root.right);
    }
    static class TreeInfo{
        int ht;
        int diam;

        public TreeInfo(int ht,int diam) {
            this.ht=ht;
            this.diam=diam;
        }
    }
    static TreeInfo diamHight(Node root){
        if(root==null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left=diamHight(root.left);
        TreeInfo right=diamHight(root.right);

        int myHight=Math.max(left.ht, right.ht)+1;

        int diam1=left.diam;
        int diam2=left.diam;
        int diam3=left.ht+right.ht+1;

        int mydiam=Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myinfo=new TreeInfo(myHight, mydiam);
        return myinfo;
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        Display(root);
        System.out.println();
        System.out.println(diamHight(root).diam);
    }
}

