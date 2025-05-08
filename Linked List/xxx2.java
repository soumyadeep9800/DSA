//display linked list using recursion;
public class xxx2 {
    public static void insertAt(Node head,int val){
        Node temp=new Node(val);
        Node t=head;
        while (t.next!=null) {
            t=t.next;
        }
        t.next=temp;
    }
    public static void displayRecursion(Node head){
        if (head==null) {
            return;
        }
        displayRecursion(head.next);//for reversal list.
        System.out.print(head.data+" ");
        //displayRecursion(head.next);
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
             this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);
        //5->3->9->8->8->16
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        insertAt(a, 84);
        displayRecursion(a);
    }
}
