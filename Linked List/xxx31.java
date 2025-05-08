//critical point max  distance.
//maybe not correct code.
public class xxx31 {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
           this.data=data;
        }
    }
    public static int Maxdistance(Node head){
        Node t=head.next;
        Node c1=null;
        Node c2=null;
        int count =0;
        while (t.next!=null) {
            int max=Integer.MIN_VALUE;
            if (t.data>t.prev.data && t.data>t.next.data) {
                c1=t;
            }
            if (t.data<t.prev.data && t.data<t.next.data) {
                c2=t;
            }
            t=t.next;
            while (c1!=c2) {
                count++;
                if (max<count) {
                    max=count;
                }
                c1=c1.next;
            }
        }
        int x=0;
        Node temp=c1;
        while (temp!=c2) {
            x++;
            temp=temp.next;
        }
        return x;
    }
    public static int Mindistance(Node head){
        Node t=head.next;
        Node c1=null;
        Node c2=null;

        while (t.next!=null) {
            if (t.data>t.prev.data && t.data>t.next.data) {
                c1=t;
            }
            if (t.data<t.prev.data && t.data<t.next.data) {
                c2=t;
            }
            t=t.next;
        }
        int x=0;
        Node temp=c1;
        while (temp!=c2) {
            x++;
            temp=temp.next;
        }
        return x;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(5);
        Node d=new Node(3);
        Node e=new Node(2);
        Node f=new Node(7);
        Node g=new Node(8);
        Node h=new Node(9);
        Node i=new Node(1);
        Node j=new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=j;

        e.prev=d;
        d.prev=c;
        c.prev=b;
        b.prev=a;
        j.prev=i;
        i.prev=h;
        h.prev=g;
        g.prev=f;
        f.prev=e; 

        System.out.println(Mindistance(a));
        System.out.println(Maxdistance(a));
    }
}
