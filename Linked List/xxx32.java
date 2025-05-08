//find merge node
public class xxx32 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void Display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int findMergeData(Node head1, Node head2) {
        Node t1 = head1;
        Node t2 = head2;
        
        // Calculate lengths of both lists
        int count1 = 0;
        int count2 = 0;
        while (t1 != null) {
            count1++;
            t1 = t1.next;
        }
        while (t2 != null) {
            count2++;
            t2 = t2.next;
        }

        // Reset pointers to the heads of the lists
        t1 = head1;
        t2 = head2;

        // If lengths are different, move the pointer of the longer list ahead by the difference
        if (count1 > count2) {
            for (int i = 0; i < count1 - count2; i++) {
                t1 = t1.next;
            }
        } else if (count1 < count2) {
            for (int i = 0; i < count2 - count1; i++) {
                t2 = t2.next;
            }
        }

        // Now both t1 and t2 are at the same distance from the merge point
        // Traverse both lists together to find the merge point
        while (t1 != null && t2 != null) {
            if (t1 == t2) { // Compare nodes directly, not the data
                return t1.data;
            }
            t1 = t1.next;
            t2 = t2.next;
        }

        // If no merge point is found, return -1 or handle it as needed
        return -1; // No merge point found
    }

    public static void main(String[] args) {
        // Example to test the code
        Node a = new Node(1);
        Node b = new Node(2);
        Node x = new Node(3);
        Node c = new Node(1);

        // Create two lists that merge
        a.next = b;
        b.next = x;  // List 1: 1 -> 2 -> 3

        c.next = b;  // List 2: 1 -> 2 -> 3 (merge happens at node with data 2)

        int mergeData = findMergeData(a, c);
        System.out.println("Merge point data: " + mergeData);
    }
}

