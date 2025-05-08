//sorted doublylist insertnode in right position.
public class xxx33 {
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
    public static void DisplayTail(Node tail){
        Node temp=tail;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static Node Insert(Node head, int data){
        Node temp=head;
        Node temp1=head;
        Node temp2=head;
        Node a=new Node(data);
        //fast indx
        if(temp.data>data){
            a.next=temp;
            temp.prev=a;
            temp=a;
            return temp;     
        }
        //last indx
        while (temp2.next!=null) {
            temp2=temp2.next;
        }
        if (temp2.data<data) {
            temp2.next=a;
            a.prev=temp2;
            return temp1;
        }
        //middle indx
        while (temp.data<data) {
           temp=temp.next;
        }
        Node t=temp;
        temp=temp.prev;
        temp.next=a;
        a.next=t;
        t.prev=a;
        a.prev=temp;
        return temp1;
    }
    public static void main(String[] args) {
        int data=0;
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
      
        d.prev=c;
        c.prev=b;
        b.prev=a;
       Node s=Insert(a, data);
       DisplayHead(s);
    }
}
