//odd even list by indx not value. 
public class xxx24 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static void Display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node oddevenList(Node head){
        Node odd=new Node(0);
        Node Even=new Node(0);
        Node temp=head;
        Node temp1=odd;
        Node temp2=Even;
        while (temp!=null) {
            temp1.next=temp;
            temp=temp.next;
            temp1=temp1.next;

            temp2.next=temp;
            // if (temp==null) {
            //     break;
            // }
            temp=temp.next;
            temp2=temp2.next;
        }
        odd=odd.next;
        Even=Even.next;
        temp1.next=Even;
        return odd;
    }
    public static void main(String[] args) {
        Node a=new Node(10);     
        Node b=new Node(21);      
        Node c=new Node(3);     
        Node d=new Node(4);     
        Node e=new Node(5);     
        Node f=new Node(6);     
        Node g=new Node(7);     
        Node h=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;

        Node oddeven=oddevenList(a);
        Display(oddeven);
    }
}
