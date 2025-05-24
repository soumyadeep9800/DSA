//convert a sorted array to balanced BST
public class aaa6 {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node constructBST(int arr[], int l,int h){
        if(l>h)return null;
        int mid=(l+h)/2;
        Node root=new Node(arr[mid]);
        root.left=constructBST(arr, l, mid-1);
        root.right=constructBST(arr, mid+1, h);
        return root;
    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int l=0, h=arr.length-1;
        Node root=constructBST(arr, l, h);
        preOrder(root);
    }
}
