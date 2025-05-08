//path sum2 l.c-113
import java.util.*;
public class aaa25 {
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
    public static void helper(List<List<Integer>> ans,List<Integer> arr,Node root,int target){
        if(root==null) return;
        if(root.left==null && root.right==null){
            arr.add(root.data);
            if(root.data==target){
                List<Integer> a=new ArrayList<>();
                for(int i=0;i<arr.size();i++){
                    a.add(arr.get(i));
                }
                ans.add(a);
            }
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.data);
        helper(ans, arr, root.left, target-root.data);
        helper(ans, arr, root.right, target-root.data);
        arr.remove(arr.size()-1);
    }
    public static List<List<Integer>> pathSum2(Node root,int target){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        helper(ans,arr,root, target);
        return ans;
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left  = new Node(7);
        root.right = new Node(9);
        root.left.left        = new Node(2);
        root.left.left.left   = new Node(5);
        root.left.right       = new Node(6);
        root.left.right.left  = new Node(5);
        root.left.right.right = new Node(11);
        root.right.right      = new Node(9);
        root.right.right.left = new Node(5);

        int target=15;
        List<List<Integer>> result=pathSum2(root, target);
        System.out.println(result);
    }
}
