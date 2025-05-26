//all element in two BST (1305)
import java.util.*;
public class aaa12 {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static ArrayList<Integer> allElementInTwoBST(Node root1,Node root2){
        ArrayList<Integer> a =new ArrayList<>();
        Node curr=root1;
        while(curr!=null){
            if(curr.left!=null){
                Node prev=curr.left;
                while(prev.right!=null && prev.right!=curr) prev=prev.right;
                if(prev.right==null){
                    prev.right=curr;
                    curr=curr.left;
                }
                if(prev.right==curr){
                    prev.right=null;
                    a.add(curr.data);
                    curr=curr.right;
                }
            }else{
                a.add(curr.data);
                curr=curr.right;
            }
        }
        ArrayList<Integer> b =new ArrayList<>();
        curr=root2;
        while(curr!=null){
            if(curr.left!=null){
                Node prev=curr.left;
                while(prev.right!=null && prev.right!=curr) prev=prev.right;
                if(prev.right==null){
                    prev.right=curr;
                    curr=curr.left;
                }
                if(prev.right==curr){
                    prev.right=null;
                    b.add(curr.data);
                    curr=curr.right;
                }
            }else{
                b.add(curr.data);
                curr=curr.right;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        merge(a,b,ans);
        return ans;
    }
    public static void merge(ArrayList<Integer> a,ArrayList<Integer> b,ArrayList<Integer> ans){
        int i=0,j=0;
        while(i<a.size() && j<b.size()){
            if(a.get(i)<=b.get(j)){
                ans.add(a.get(i));
                i++;
            }else{ //a.get(i)>b.get(j)
                ans.add(b.get(j));
                j++;
            }
        }
            while(j<b.size()){
                ans.add(b.get(j));
                j++;
            }
            while(i<a.size()){
                ans.add(a.get(i));
                i++;
            }
    }
    public static void main(String[] args) {
        Node root1=new Node(10);
        Node a=new Node(5);
        Node b=new Node(15);
        Node c=new Node(3);
        Node d=new Node(7);
        Node e=new Node(12);
        Node f=new Node(17);
        root1.left = a;
        root1.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        Node root2=new Node(20);
        Node a1=new Node(15);
        Node b1=new Node(25);
        Node c1=new Node(13);
        Node d1=new Node(17);
        Node e1=new Node(22);
        Node f1=new Node(27);
        root2.left = a1;
        root2.right = b1;
        a1.left = c1;
        a1.right = d1;
        b1.left = e1;
        b1.right = f1;

        System.out.println(allElementInTwoBST(root1, root2));
    }
}
