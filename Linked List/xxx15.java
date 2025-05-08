// Java program to merge two sorted linkedlist.
public class xxx15 {

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
        Node head=new Node(100);
        Node temp=head;
        while (temp1!=null && temp2!=null) {
            if (temp1.data<temp2.data) {
                Node a=new Node(temp1.data);
                temp.next=a;
                temp=a;
                temp1=temp1.next;
            }else{
                Node a=new Node(temp2.data);
                temp.next=a;
                temp=a;
                temp2=temp2.next;
            }
        }
        if (temp1==null) {
            temp.next=temp2;
        }else{
            temp.next=temp1;
        }
        return head.next;
    }

    public static void main(String[] args) {
        Node x = new Node(1);
        Node y = new Node(2);
        Node z = new Node(5);
        Node k = new Node(8);
        x.next = y;
        y.next = z;
        z.next = k;
        Node x1 = new Node(3);
        Node y1 = new Node(4);
        Node z1 = new Node(6);
        Node k1 = new Node(7);
        x1.next = y1;
        y1.next = z1;
        z1.next = k1;

        System.out.print("Marge linked list is: ");
        Node marge=margeLinklist(x, x1);
        Display(marge);
    }
}
