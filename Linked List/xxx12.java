//check linked list cycle
public class xxx12 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static boolean hasCycle(Node head){
        if(head==null||head.next==null) return false;
        Node slow=head;
        Node fast=head;
        while (fast!=null) {
            if (slow==null) return false;
            slow=slow.next;
            if (fast.next==null) return false;
            fast=fast.next.next;
            if (fast==slow) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node x=new Node(3);
        Node y=new Node(2);
        Node z=new Node(0);
        //Node k=new Node(-4);
        x.next=y;
        y.next=z;
       // z.next=k;
       // k.next=y;

        if (hasCycle(x)) {
            System.out.println("This is a cycle");
        }else{
            System.out.println("Not");
        }
    }
}
