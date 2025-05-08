// Java program to merge two sorted linkedlist not using space.
public class xxx16 {
    public static void Display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node margeLinklist(Node head1, Node head2) {
        Node temp1=head1;
        Node temp2=head2;
        Node h=new Node(100);
        Node t=h;
        while (temp1!=null && temp2!=null) {
            if (temp1.data<temp2.data) {
                t.next=temp1;
                t=temp1;
                temp1=temp1.next;
            }else{
                t.next=temp2;
                t=temp2;
                temp2=temp2.next;
            }          
            System.out.println(t.data);
        }
        if (temp1==null) {
            t.next=temp2;
        }else{
            t.next=temp1;
        }
        return h.next;
    }
    public static void main(String[] args) {
        Node x = new Node(1);
        Node y = new Node(3);
        Node z = new Node(5);
        Node k = new Node(6);
        x.next = y;
        y.next = z;
        z.next = k;
        Node x1 = new Node(2);
        //Node y1 = new Node(4);
        //Node z1 = new Node(6);
       // Node k1 = new Node(7);
        //x1.next = y1;
      //  y1.next = z1;
      //  z1.next = k1;
        Node marge=margeLinklist(x, x1);
        Display(marge); 
    }
}
