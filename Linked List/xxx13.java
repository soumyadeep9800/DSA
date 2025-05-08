//find the node where the cycle begin .
public class xxx13 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static Node findCommonCycleNode(Node head){
        Node slow=head;
        Node fast=head;
        if (fast == null || fast.next == null) return null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow) {
                break;
            }
        }
        Node temp=head; 
        while (slow!=temp) {
            temp=temp.next;
            slow=slow.next;
        }
        return slow;
    } 
    public static void main(String[] args) {
        Node x=new Node(1);
        Node y=new Node(3);
        Node z=new Node(4);
        Node k=new Node(-4);
        x.next=y;
        y.next=z;
        z.next=k;
        k.next=y;
        Node xxx=findCommonCycleNode(x);
        if (xxx != null)
        System.out.println("The common cycle node is: " + xxx.data);
        else
        System.out.println("No cycle found");
    }
}
//cycle remove
// public static void removeLoop(Node head) {
//     if (head == null || head.next == null) return;

//     Node slow = head;
//     Node fast = head;

//     // Step 1: Detect the loop using Floyd's Cycle Detection algorithm
//     while (fast != null && fast.next != null) {
//         slow = slow.next;
//         fast = fast.next.next;

//         // If slow and fast meet, there's a loop
//         if (slow == fast) {
//             break;
//         }
//     }
//     // If no loop is detected, return
//     if (slow != fast) return;

//     // Step 2: Find the start of the loop
//     slow = head;
//     while (slow != fast) {
//         slow = slow.next;
//         fast = fast.next;
//     }
//     // Now, 'slow' is at the start of the loop
//     // Step 3: Find the node just before the start of the loop and remove the loop
//     Node loopNode = slow;
//     while (fast.next != loopNode) {
//         fast = fast.next;
//     }
//     // Remove the loop by making the next pointer of the last node null
//     fast.next = null;
// }
