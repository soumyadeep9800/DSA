//inorder predecessor ans successor a given key in BST
// import java.util.ArrayList;

// public class aaa4 {
//     public static class Node{
//         int data;
//         Node left,right;
//         Node(int data){
//             this.data=data;
//             this.left=null;
//             this.right=null;
//         }
//     }
//     public static void inorderListAdd(Node root,ArrayList<Integer> arr){
//         if(root==null) return;
//         inorderListAdd(root.left, arr);
//         arr.add(root.data);
//         inorderListAdd(root.right, arr);
//     }
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
//         int val=5;
//         inorderListAdd(root, arr);

//         int idx=-1;
//         for(int i=0;i<arr.size();i++){
//             if(val==arr.get(i)){
//                 idx=i;
//                 break;
//             }
//         }
//         System.out.println("Inorder predecessor: "+ arr.get(idx-1));
//         System.out.println("Inorder successor: "+ arr.get(idx+1));
//     }
// }
//inorder predecessor ans successor a given key in BST using recursion
public class aaa4 {
    static Node temp=null;
    static boolean flag=false;
    static int predecessor=-1;
    static int successor=-1;
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void inorderPreSuc(Node root,int data){
        if(root==null) return;
        inorderPreSuc(root.left, data);
        if(temp==null) temp=root;
        else{
            if(root.data==data){
                predecessor=temp.data;
                flag=true;
            }else if(root.data>data && flag==true){
                successor=root.data;
                flag=false;
            }else{
                temp=root;
            }
        }
        inorderPreSuc(root.right, data);
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

        inorderPreSuc(root,5);

        System.out.println(predecessor);
        System.out.println(successor);
    }
}
