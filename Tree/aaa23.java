//constuct binary tree from preorder and inorder
public class aaa23 {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node helper(int pre[],int prelow,int prehi,int in[],int inlow,int inhi){
        if(prelow>prehi) return null;
        Node root=new Node(pre[prelow]);
        int i=inlow;
        while(in[i]!=pre[prelow]) i++;
        int leftsize=i-inlow;
        root.left=helper(pre, prelow+1, prelow+leftsize, in, inlow, i-1);
        root.right=helper(pre, prelow+leftsize+1, prehi, in, i+1, inhi);
        return root;
    }
    public static Node buildTree(int pre[],int in[]){
        int n=pre.length;
        return helper(pre,0,n-1,in,0,n-1);
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int pre[]={1,2,4,5,3,6};
        int in[] ={4,2,5,1,3,6};
        Node root=buildTree(pre, in);
        preorder(root);
    }
}
