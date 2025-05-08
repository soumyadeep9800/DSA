//given a list split odd even two separate list
public class xxx17 {
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
    public static Node[] SplitOddEven(Node head){
        if (head == null) {
            return null;
        }

        Node temp=head;
        Node a=new Node(0);
        Node b=new Node(-1);
        Node x=a;
        Node y=b;
        while (temp!=null) {
            if (temp.data %2==0) {
                x.next=temp;
                x=temp;
                temp=temp.next;
            }else{
                y.next=temp;
                y=temp;
                temp=temp.next;
            }
        }
        x.next=null;
        y.next=null;

        
        return new Node[] {a.next,b.next};
    }
    public static void main(String[] args) {
        Node a=new Node(1);     
        Node b=new Node(2);     
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

        Node[] result=SplitOddEven(a);
        System.out.print("Even list is: ");
        Display(result[0]);
        System.out.print("Odd list is: ");
        Display(result[1]);
    }
}
