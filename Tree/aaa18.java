import java.util.*;  //257
public class aaa18 {
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
    public static void helper(Node root,List<String> ans,String s){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s+=root.data;
            ans.add(s);
            return;
        }
        helper(root.left, ans, s+root.data+"->");
        helper(root.right, ans, s+root.data+"->");
    }
    public static List<String> binaryTreePaths(Node root){
        List<String> ans=new ArrayList<>();
        helper(root,ans,"");
        return  ans;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(7);
        Node b=new Node(9);
        Node c=new Node(2);
        Node d=new Node(6);
        Node e=new Node(9);
        Node f=new Node(5);
        Node g=new Node(11);
        Node h=new Node(5);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.right=e;
        d.left=f;
        d.right=g;
        e.left=h;

        List<String> paths = binaryTreePaths(root);
            for (String path : paths) {
                System.out.println(path);
            }
    }
}
