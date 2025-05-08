//doubly list check palindrom

public class xxx28 {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
           this.data=data;
        }
    }
    public static boolean palindrom(Node head){
        Node temp=head;
        Node h=temp;
        while (temp.next!=null) {
            temp=temp.next;
        }
        Node t=temp;
        while (h!=t) {
            if (h.data!=t.data) {
                return false;
            }
            h=h.next;
            t=t.prev;
        }
        return true;
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
        if (palindrom(a)) {
            System.out.println("it's palindrom");
        }else{
            System.out.println("not palindrom");
        }
    }
}
