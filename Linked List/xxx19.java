// reverse list using recursion
public class xxx19 {
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
    public static Node reverse(Node head){
        if (head.next==null) return head;
        Node newhead=reverse(head.next);
        head.next.next=head;//interchanging connection node
        head.next=null;
        return newhead;
    }
    public static void main(String[] args) {
        Node a=new Node(1);          
        Node b=new Node(2);     
        Node c=new Node(3);         
        Node d=new Node(4);     
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.print("orginal list: ");
        Display(a);
        System.out.print("reverse list: "); 
        Node aaa=reverse(a);
        Display(aaa);
    }
}
