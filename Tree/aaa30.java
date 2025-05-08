//Amount of time for tree to be infacted(l.c-2385)
import  java.util.*;
public class aaa30 {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node findNode(Node root, int target) {
        if (root == null) return null;
        if (root.data == target) return root;
        Node leftResult = findNode(root.left, target);
        Node rightResult = findNode(root.right, target);
        if(leftResult==null) return rightResult;
        else return leftResult;
    }

    public static void PreOrder(Node root,Map<Node,Node> p){
        if(root==null) return;
        if(root.left!=null) p.put(root.left, root);
        if(root.right!=null) p.put(root.right, root);
        PreOrder(root.left, p);
        PreOrder(root.right, p);
    }

    public static int amountOfTime(Node root,int target){
        Node node=findNode(root, target);
        Map<Node,Node> p=new HashMap<>();
        PreOrder(root,p);
        //bfs
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        Map<Node,Integer> v=new HashMap<>();
        v.put(node,0);
        while (!q.isEmpty()) {
            Node temp=q.remove();
            int level=v.get(temp);
            if(temp.left!=null && !v.containsKey(temp.left)){
                q.add(temp.left);
                v.put(temp.left, level+1);
            }
            if(temp.right!=null && !v.containsKey(temp.right)){
                q.add(temp.right);
                v.put(temp.right, level+1);
            }
            if(p.containsKey(temp) && !v.containsKey(p.get(temp))){
                q.add(p.get(temp));
                v.put(p.get(temp), level+1);
            }
        }
        int max=-1;
        for(int level:v.values()){
            max=Math.max(max, level);
        }
        return max;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(7);
        Node b = new Node(9);
        Node c = new Node(2);
        Node d = new Node(6);
        Node e = new Node(9);
        Node f = new Node(5);
        Node g = new Node(11);
        Node h = new Node(5);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        d.left = f;
        d.right = g;
        e.left = h;
        int target=2;
        int result=amountOfTime(root, target);
        System.out.println(result);
    }
}
