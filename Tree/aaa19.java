//lowest common ancestor of a binary tree 236
public class aaa19 {
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
    public static boolean contains(Node root,Node node){
        if(root==null) return false;
        if(root==node) return true;
        return contains(root.left, node) || contains(root.right, node);
    }
    public static Node lowestCommonAncestor(Node root,Node p,Node q){
        if(p==root || q==root) return root;
        if(p==q) return p;
        boolean leftp=contains(root.left, p);
        boolean rightq=contains(root.right, q);
        if((leftp && rightq) || (!leftp && !rightq)) return root;
        if(leftp && !rightq) return  lowestCommonAncestor(root.left, p, q);
        if(!leftp && rightq) return  lowestCommonAncestor(root.right, p, q);
        return null;
    }
    public static Node lowestCommonAncestorBetter(Node root, Node p, Node q) {
        if (root == null || root == p || root == q) return root;
    
        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);
    
        if (left != null && right != null) return root; // p and q found on different sides
        return (left != null) ? left : right; // one side has both or one match
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

        Node xx=lowestCommonAncestor(root, h, g);
        System.out.println(xx.data);
    }
}


// If the current root is null, or matches either p or q, return root.

// Recursively search in left and right subtrees.

// If both left and right return non-null, current node is the LCA.

// If only one side is non-null, return that — it means both p and q are on that side.

