public class xxx25 {
    public static class Node{
        int data;
        Node next;
        Node random;
        Node(int data){
            this.data=data;
            this.random=null;
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
    public static Node copyRandomList(Node head){
        Node head2=new Node(0);
        Node temp1=head;
        Node temp2=head2;
        //deep copy
        while (temp1!=null) {
           Node t=new Node(temp1.data); 
           temp2.next=t;
           temp2=t;
           temp1=temp1.next;
        }
        head2=head2.next;
        temp2=head2;
        temp1=head;
    //alternate connection
    Node temp=new Node(-1);
    while (temp1!=null) {
        temp.next=temp1;
        temp1=temp1.next;
        temp=temp.next;

        temp.next=temp2;
        temp2=temp2.next;
        temp=temp.next;
    }
    temp2=head2;
    temp1=head;
    //assigning random pointers
    while (temp1!=null&&temp2!=null) {
        if (temp1.random==null) {
            temp2.random=null;
        }
        else{
            temp2.random=temp1.random.next;
        }
        temp1=temp1.next;
        if(temp1!=null) temp2=temp1.next;
    }
    temp2=head2;
    temp1=head;
    //seperation the lists
    while (temp1!=null) {
        temp1.next=temp2.next;
        temp1=temp1.next;
        if (temp1==null) {
            break;
        }
        temp2.next=temp1.next;
        if (temp.next==null) {
            break;
        }
        temp2=temp2.next;
    }
    return head2;
    }
    public static void main(String[] args) {
        Node a=new Node(7);
        Node b=new Node(13);
        Node c=new Node(11);
        Node d=new Node(10);
        Node e=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        a.random=null;
        e.random=a;
        b.random=a;
        c.random=e;
        d.random=c;
        Node vvv=copyRandomList(a);
        Display(vvv);
    }
}
