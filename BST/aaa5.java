// Validate BST(98)
// import java.util.*;
// public class aaa5 {
//     public static class Node{
//         int data;
//         Node left,right;
//         Node(int data){
//             this.data=data;
//             this.left=null;
//             this.right=null;
//         }
//     }
// public static void inorderAddList(Node root,ArrayList<Integer> arr){
//     if(root==null) return;
//     inorderAddList(root.left, arr);
//     arr.add(root.data);
//     inorderAddList(root.right, arr);
// }
// public static boolean checkSorted(ArrayList<Integer> arr){
//     for(int i=0;i<arr.size()-1;i++){
//         if(arr.get(i)>arr.get(i+1)){
//             return false;
//         }
//     }
//     return true;
// }
//     public static void main(String[] args) {
//         Node root=new Node(10);
//         Node a=new Node(5);
//         Node b=new Node(15);
//         Node c=new Node(3);
//         Node d=new Node(7);
//         Node e=new Node(12);
//         Node f=new Node(17);
//         root.left = a;
//         root.right = b;
//         a.left = c;
//         a.right = d;
//         b.left = e;
//         b.right = f;

//         ArrayList<Integer> arr=new ArrayList<>();
//         inorderAddList(root, arr);
//         System.out.println(checkSorted(arr));
//     }
// }

// Validate BST(98)
public class aaa5 {
    static Node temp=null;
    static boolean flag=true;
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
public static void inorder(Node root){
    if(root==null) return;
    inorder(root.left);
    if(temp==null) temp=root;
    else if(root.data<=temp.data){
        flag=false;
    }
    else temp=root;
    inorder(root.right);
}
public static boolean checkSorted(Node root){
    flag=true;
    temp=null;
    inorder(root);
    return flag;
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

        checkSorted(root);
        System.out.println(flag);
    }
}
