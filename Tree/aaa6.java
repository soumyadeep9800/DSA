//count number of nodes
import java.util.*;
public class aaa6 {
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
        static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1) return null;

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    static void displayTree(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        displayTree(root.left);
        displayTree(root.right);
    }

    static int countNodes(Node root){
        if(root==null) return 0;
        int leftCount=countNodes(root.left);
        int rightCount=countNodes(root.right);
        return leftCount+rightCount+1;
        // if(root==null) return 0;
        // return countNodes(root.left)+countNodes(root.right)+1;
    }

    static int countNodesIteratively(Node root) {
    if (root == null) return 0;
    int count = 0;
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        Node current = queue.poll();
        count++; // Increment count for the current node

        if (current.left != null) queue.add(current.left);
        if (current.right != null) queue.add(current.right);
    }
    return count;
}
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        //System.out.println(root.data);
        displayTree(root);
        System.out.println();
        System.out.println(countNodes(root));
        //System.out.println(countNodesIteratively(root));
    }
}
