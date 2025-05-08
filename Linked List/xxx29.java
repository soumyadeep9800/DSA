//doubly list head delete
public class xxx29 {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
           this.data=data;
        }
    }
    public static void DisplayHead(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node deleteHead(Node head){
        Node temp=head;
        Node t=new Node(-1);
        Node s=temp.next;
        s.prev=t;
        t.next=s;
        return t.next;
        // Node newHead = head.next;
        // newHead.prev = null;
        // return newHead;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        e.prev=d;
        d.prev=c;
        c.prev=b;
        b.prev=a;
        Node zzz=deleteHead(a);
        DisplayHead(zzz);
    }
}
