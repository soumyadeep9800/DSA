import java.util.*;
public class aaa27 {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }
    public static int dfs(Node node, long currSum,long target, Map<Long,Integer> prefix) {
        if (node == null) return 0;

        currSum += node.data;
        int paths = prefix.getOrDefault(currSum - target, 0);

        prefix.put(currSum, prefix.getOrDefault(currSum, 0) + 1);

        paths += dfs(node.left,  currSum, target, prefix);
        paths += dfs(node.right, currSum, target, prefix);

        prefix.put(currSum, prefix.get(currSum) - 1);  // back-track
        return paths;
    }

    public static int pathSum2(Node root, int target) {
        Map<Long,Integer> prefix = new HashMap<>();
        prefix.put(0L, 1);
        return dfs(root, 0L, target, prefix);
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

        System.out.println(pathSum2(root, 15));
    }
}


