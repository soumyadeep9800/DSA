//delete middle node
public class xxx11 {
    public static void Display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node MiddleDelete(Node head){
        if (head.next==null||head==null) {
            return null;
        }
        Node fast=head;
        Node slow=head;
        while (fast.next.next!=null &&fast.next.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node x1=new Node(87);
        Node x2=new Node(100);
        Node x3=new Node(13);
        Node x4=new Node(4);
        Node x5=new Node(50);
        Node x6=new Node(12);
        Node x7=new Node(10);
        x1.next=x2;
        x2.next=x3;
        x3.next=x4;
        x4.next=x5;
        x5.next=x6;
        x6.next=x7; 
        System.out.print("orginal node: ");
        Display(x1);
        System.out.println();
        System.out.print("Atefer delete: ");
        Node temp=MiddleDelete(x1);
        Display(temp);
    }
}
 
   
// public class xxx11 {
//     public static void Display(Node head){
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static class Node {
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//         }
//     }

//     public static Node MiddleDelete(Node head){
//         if (head == null || head.next == null) {
//             return null; // If there's only one node or no nodes, return null
//         }
//         Node fast = head;
//         Node slow = head;
//         Node prev = null; // To keep track of the node before the middle node

//         while (fast != null && fast.next != null) {
//             fast = fast.next.next;
//             prev = slow;
//             slow = slow.next;
//         }

//         if (prev != null) {
//             prev.next = slow.next;
//         }

//         return head; // Return the head of the modified list
//     }

//     public static void main(String[] args) {
//         Node x1 = new Node(87);
//         Node x2 = new Node(100);
//         Node x3 = new Node(13);
//         Node x4 = new Node(4);
//         Node x5 = new Node(50);
//         Node x6 = new Node(12);
//         Node x7 = new Node(10);
//         x1.next = x2;
//         x2.next = x3;
//         x3.next = x4;
//         x4.next = x5;
//         x5.next = x6;
//         x6.next = x7;

//         System.out.print("Original list: ");
//         Display(x1);

//         x1 = MiddleDelete(x1);

//         System.out.print("List after deleting the middle node: ");
//         Display(x1);
//     }
// }
