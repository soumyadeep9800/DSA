
public  class a{
    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }
    public static Node buildDemoTree() {
        Node root = new Node(1);
    
        root.left  = new Node(7);
        root.right = new Node(9);
    
        // left‑subtree
        root.left.left        = new Node(2);          // 1‑7‑2‑5 (sum 15)
        root.left.left.left   = new Node(5);
    
        root.left.right       = new Node(6);          // keeps original 6‑subtree
        root.left.right.left  = new Node(5);
        root.left.right.right = new Node(11);
    
        // right‑subtree (unchanged, sums ≠ 15)
        root.right.right      = new Node(9);
        root.right.right.left = new Node(5);
    
        return root;
    }
}
