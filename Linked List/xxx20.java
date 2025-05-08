// reverse list using iteration
public class xxx20 {
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
    public static Node reverseList(Node head){
        Node curr=head;
        Node pre=null;
        Node Next=null;
        while (curr!=null) {
            Next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=Next;
        }
        return pre;
    }
    public static void main(String[] args) {
        Node a=new Node(1);          
        Node b=new Node(2);     
        Node c=new Node(3);         
        Node d=new Node(4);     
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.print("orginal list is: ");
        Display(a);
        System.out.print("reverse list is: ");
        Node eee=reverseList(a);
        Display(eee);
    }
}
